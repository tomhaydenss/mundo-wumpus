package br.iesb.pos.mobile.android1;

public interface MundoWumpus {

	Resultado andarPara(Direcao direcaoInformada);

	Resultado atirarPara(Direcao direcaoInformada);

	String exibirParcial();

	String exibirTudo();

}
