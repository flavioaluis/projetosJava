package br.pucpcaldas.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.pucpcaldas.pedidos.dominio.Produto;

/**
 * Unit test for simple App.
 */
class TestaProduto {
   
    @Test
    void testeConstrutor_DeveCriarUmProdutoValido() {
        Produto caneta = new Produto(1, "caneta", 1.50);

        assertEquals(1, caneta.getCodigo());
        assertEquals("caneta", caneta.getNome());
        assertEquals(1.50, caneta.getPreco(), 0.001);
    }
}
