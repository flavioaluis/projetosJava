package br.pucpcaldas.pedidos.dominio;

/**Um objeto da classe <code> ItemDoPedido</code> armazena as informações de um
 * item associado a um objeto da classe <code>Pedido</code> .
 * @author flavio
 * version 1.0
 * @see Pedido
 */

public class ItemDoPedido {
	private Produto produto;
	private double quantidade;

    /**
     * COnstrutor da classe
     * @param produto     o produto associado ao item
     * @param quantidade  quantidade de produtos do item.
     */

	public ItemDoPedido(Produto produto, double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

    /**
     *  Calcula o custo total do item que é igual ao preco do 
     * produto multiplicado pela quantidade comprada
     * @return
     */
    
	public double calculaCusto() {
		return this.produto.getPreco() * this.quantidade;
	}

	@Override
	public String toString() {
		return String.format("ItemDoPedido : produto=%s, quantidade=%.2f",
				this.produto, this.quantidade);
	}
}