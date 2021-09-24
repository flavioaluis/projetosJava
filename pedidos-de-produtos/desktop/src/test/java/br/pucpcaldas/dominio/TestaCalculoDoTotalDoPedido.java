package br.pucpcaldas.dominio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.pucpcaldas.pedidos.dominio.Pedido;
import br.pucpcaldas.pedidos.dominio.Produto;

public class TestaCalculoDoTotalDoPedido {

    private static Produto caneta;
    private static Produto lapis;
    private Pedido pedido;

    @BeforeClass
    public static void configuraTeste() {
        caneta = new Produto(1, "Caneta", 1.50);
        lapis = new Produto(1, "Lápis", 1.00);
    }

    @Before
    public void configura() {
        pedido = new Pedido(100);
    }

    @Test
    public void oTotalDoPedidoDeveraRetornarZeroParaUmPedidoSemItens() {
        assertEquals(0.0, pedido.calculaTotal(), 0.01);
    }

    @Test
    public void oTotalDoPedidoDeveraRetornarUmValorParaUmPedidoCom1Item() {
        pedido.incluiItem(caneta, 2);
        assertEquals(3.0, pedido.calculaTotal(), 0.01);
    }

    @Test
    public void oTotalDoPedidoDeveraRetornarUmValorParaUmPedidoCom2Itens() {
        pedido.incluiItem(caneta, 2);
        pedido.incluiItem(lapis, 3);
        assertEquals(6.0, pedido.calculaTotal(), 0.01);
    }

    @After
    public void desconfigura() {
        pedido = null;
    }

    @AfterClass
    public static void desconfiguraTeste() {
        caneta = null;
        lapis = null;
    }

}