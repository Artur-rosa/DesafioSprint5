package br.com.artur.DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import br.com.artur.DAO.ProdutoDAO;
import br.com.artur.jackson.XML;
import br.com.artur.entities.Produto;

public class ProdutoDAO implements XML{

	private static final XmlMapper xmlMapper = new XmlMapper();
	private static List<Produto> produtos = new ArrayList<Produto>();
	private String filename = "produtos.xml";
	private File arquivo = new File(filename);
	private static ProdutoDAO instance;
	
	public static synchronized ProdutoDAO getInstance() throws IOException {
		if (instance == null) {
			instance = new ProdutoDAO();
		}
		return instance;
	}
	
	
	public void add(Produto produto) {
		//escreve no arquivo aqui
		produtos.add(produto);
		escreveListaNoArquivo();
	}
	
	public List<Produto> findAll(){
		return Collections.unmodifiableList(getLista());
	}

	@Override
	public void escreveListaNoArquivo() {
		try {
			xmlMapper.writeValue(arquivo, produtos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Produto> getLista() {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(arquivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro, arquivo não encontrado!");
		}
		TypeReference<List<Produto>> typeReference = new TypeReference<List<Produto>>() {};
		List<Produto> lista = null;
		try {
			lista = xmlMapper.readValue(inputStream, typeReference);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lista.isEmpty()) {
			System.out.println("Lista vazia, inserir dados antes");
			return null;
		}
		return lista;
	}
}

