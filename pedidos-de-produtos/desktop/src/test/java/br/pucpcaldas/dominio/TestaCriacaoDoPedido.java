package br.pucpcaldas.dominio;

import org.junit.Test;

import br.pucpcaldas.pedidos.dominio.Pedido;

public class TestaCriacaoDoPedido {

	@Test(expected = IllegalArgumentException.class)
	public void criaUmPedidoComNumeroNegativo() {
		@SuppressWarnings("unused")
		Pedido pedido = new Pedido(-1);
	}

}