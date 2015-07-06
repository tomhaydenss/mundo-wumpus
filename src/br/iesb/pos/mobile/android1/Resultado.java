package br.iesb.pos.mobile.android1;

import java.util.List;

public interface Resultado {

	List<Item> itensDaSala();
	boolean movimentoValido();
	boolean gameOver();
	boolean venceu();

}
