package br.com.artur.services;

import br.com.artur.DAO.PedidoDAO;
import br.com.artur.entities.Pedido;

public class CadastroDePedidos {
	
	Pedido pedido = new Pedido();
	private PedidoDAO  pedidoDao;
	
	
	public void CadastroPedidos() {
		pedidoDao = PedidoDAO.getInstance();
	}
	
	public void cadastraPedido(Pedido pedido) {
		pedidoDao.cadastrarPedido(pedido);
	}
}
