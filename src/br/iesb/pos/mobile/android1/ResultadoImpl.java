package br.iesb.pos.mobile.android1;

import java.util.LinkedList;
import java.util.List;

public class ResultadoImpl implements Resultado {

	private boolean movimentoValido;
	private List<Item> itensDaSala = new LinkedList<Item>();
	private boolean gameOver = false;
	private boolean venceu = false;

	public ResultadoImpl(boolean movimentoValido, List<Item> itensDaSala,
			boolean gameOver, boolean venceu) {
		this.movimentoValido = movimentoValido;
		this.itensDaSala = itensDaSala;
		this.gameOver = gameOver;
		this.venceu = venceu;
	}

	public ResultadoImpl(boolean movimentoValido) {
		this.movimentoValido = movimentoValido;
	}

	@Override
	public boolean movimentoValido() {
		return movimentoValido;
	}

	@Override
	public List<Item> itensDaSala() {
		return itensDaSala;
	}

	@Override
	public boolean gameOver() {
		return gameOver;
	}

	@Override
	public boolean venceu() {
		return venceu;
	}

	@Override
	public String toString() {
		return "[movimentoValido=" + movimentoValido + ", itensDaSala="
				+ itensDaSala + ", gameOver=" + gameOver + ", venceu=" + venceu
				+ "]";
	}

}
