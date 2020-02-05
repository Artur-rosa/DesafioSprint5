package br.com.artur.services;

import br.com.artur.DAO.ProdutoDAO;
import br.com.artur.entities.Produto;

public class CadastroDeProduto {
	
	private ProdutoDAO produtoDAO;
	
	private void produtoCadastro() {
		produtoDAO = ProdutoDAO.getInstance();
	}
	public void cadastraProduto(Produto produto) {
		produtoDAO.adicionaProduto(produto);
	}
}
