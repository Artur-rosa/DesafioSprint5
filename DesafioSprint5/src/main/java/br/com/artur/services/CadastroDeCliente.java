package br.com.artur.services;

import java.io.IOException;
import java.util.Scanner;

import br.com.artur.DAO.ClienteDAO;
import br.com.artur.entities.Cliente;

public class CadastroDeCliente {
	private ClienteDAO clienteDAO;

	public void ClienteCadastro() {
		clienteDAO = ClienteDAO.getInstance();
	}

	public void cadastraCliente(Cliente cliente) {
		clienteDAO.adicionaCliente(cliente);
	}

}
