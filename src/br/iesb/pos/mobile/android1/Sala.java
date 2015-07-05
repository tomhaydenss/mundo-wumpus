package br.iesb.pos.mobile.android1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sala {

	private Set<Item> items = new LinkedHashSet<Item>();
	private Sala vizinhoDeCima;
	private Sala vizinhoDeBaixo;
	private Sala vizinhoDaEsquerda;
	private Sala vizinhoDaDireita;

	public Sala getVizinhoDeCima() {
		return vizinhoDeCima;
	}

	public void setVizinhoDeCima(Sala vizinhoDeCima) {
		this.vizinhoDeCima = vizinhoDeCima;
	}

	public Sala getVizinhoDeBaixo() {
		return vizinhoDeBaixo;
	}

	public void setVizinhoDeBaixo(Sala vizinhoDeBaixo) {
		this.vizinhoDeBaixo = vizinhoDeBaixo;
	}

	public Sala getVizinhoDaEsquerda() {
		return vizinhoDaEsquerda;
	}

	public void setVizinhoDaEsquerda(Sala vizinhoDaEsquerda) {
		this.vizinhoDaEsquerda = vizinhoDaEsquerda;
	}

	public Sala getVizinhoDaDireita() {
		return vizinhoDaDireita;
	}

	public void setVizinhoDaDireita(Sala vizinhoDaDireita) {
		this.vizinhoDaDireita = vizinhoDaDireita;
	}

	public void adicionarItem(Item item) {
		items.add(item);
		Item efeito = item.getEfeito();
		if (efeito != null) {
			if (vizinhoDeCima != null) {
				vizinhoDeCima.adicionarItem(efeito);
			}
			if (vizinhoDeBaixo != null) {
				vizinhoDeBaixo.adicionarItem(efeito);
			}
			if (vizinhoDaEsquerda != null) {
				vizinhoDaEsquerda.adicionarItem(efeito);
			}
			if (vizinhoDaDireita != null) {
				vizinhoDaDireita.adicionarItem(efeito);
			}
		}
	}

	public boolean temOuro() {
		return temItem(Item.OURO);
	}

	public boolean temWumpus() {
		return temItem(Item.WUMPUS);
	}

	public boolean temCova() {
		return temItem(Item.COVA);
	}

	public boolean temItem(Item item) {
		boolean resultado = false;
		for (Item i : items) {
			if (i.equals(item)) {
				resultado = true;
			}
		}
		return resultado;
	}

	public boolean temAlgumDestesItens(Item[] restricoes) {
		boolean resultado = false;
		for (int i = 0; i < restricoes.length; i++) {
			if (temItem(restricoes[i])) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Item item : items) {
			sb.append(item.codigo);
		}
		return sb.toString();
	}

}
