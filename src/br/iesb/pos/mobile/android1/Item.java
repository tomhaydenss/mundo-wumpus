package br.iesb.pos.mobile.android1;

public enum Item {
	
	FEDOR('F', null), BRISA('B', null), WUMPUS('W', FEDOR), COVA('C', BRISA), OURO('O', null), AGENTE('A', null);
	
	char codigo;
	Item efeito;
	Item(char codigo, Item efeito) {
		this.codigo = codigo;
		this.efeito = efeito;
	}
	
	public Item getEfeito() {
		return this.efeito;
	}
	
}
