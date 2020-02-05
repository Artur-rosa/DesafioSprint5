package br.com.artur.application;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.artur.entities.Cliente;
import br.com.artur.entities.Produto;
import br.com.artur.services.CadastroDeCliente;
import br.com.artur.services.CadastroDeProduto;



public class Main {

	public static void main(String[] args) {

		int opcao;
		Scanner sc = new Scanner(System.in);

		System.out.println("Menu de opera��es :");
		System.out.println("1:Listar pedidos");
		System.out.println("2:Fazer um pedido");
		System.out.println("3:Cadastar cliente");
		System.out.println("4:Cadastrar produto");
		System.out.println("5:Sair");

		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			
			//listaEstoque();
			
			
			break;

		case 2:
			// fezerPedido();
			break;

		case 3:

			Cliente cliente = new Cliente();
			CadastroDeCliente cadcliente = new CadastroDeCliente();

			System.out.println("Informe o nome do cliente:");
			cliente.setNome(sc.next());

			System.out.println("Informe o cpf do cliente:");
			cliente.setCpf(sc.next());

			System.out.println("Informe o endereco do cliente:");
			cliente.setEndereco(sc.next());

			cadcliente.cadastraCliente(cliente);

			System.out.println("Cadastro realizado!");
			break;

		case 4:
			
			Produto produto = new Produto();
			CadastroDeProduto cadProd = new CadastroDeProduto();

			System.out.println("Informe o nome do produto:");
			produto.setNome(sc.next());

			System.out.println("Informe o codigo do produto:");
			produto.setCodigo(sc.next());

			System.out.println("Informe o pre�o do produto:");
			produto.setPreco(sc.nextFloat());

			cadProd.cadastraProduto(produto);

			break;
		case 5:
			break;

		}
		public void listaEstoque()  {
			List<Produto> lista = new ProdutoLista().buscarTodos();
			if(lista.isEmpty()) System.out.println("Não existem produtos");
			lista.forEach(produto -> System.out.println("C�digo: "+produto.getId()+" - Nome: "+ produto.getNome() + " - Valor: "+ produto.getValor() +" - Quantidade em estoque: "+produto.getQuantidade()));
		}
		
		
		  private static void listaClientes() {
		List<Cliente> listaClientes = new ClienteLista().buscarTodos();
		listaClientes.forEach(cliente -> System.out.println("C�digo: "+cliente.getId()+" - Nome: "+cliente.getNome()));
	}
	}

}
