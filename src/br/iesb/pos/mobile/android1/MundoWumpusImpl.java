package br.iesb.pos.mobile.android1;

public class MundoWumpusImpl implements MundoWumpus {

	private Malha malha;
	private int quantidadeFlecha;
	private int wumpusDerrotados = 0;
	private int ourosEncontrados = 0;

	public MundoWumpusImpl(Malha malha, int quantidadeFlecha) {
		this.malha = malha;
		this.quantidadeFlecha = quantidadeFlecha;
	}

	@Override
	public Resultado andar(Direcao direcao) {
		return null;
	}

	@Override
	public Resultado atirar(Direcao direcao) {
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(malha.toString());
		sb.append("\n\n");
		sb.append("Quantidade Flecha: ").append(quantidadeFlecha);
		sb.append("\n");
		sb.append("Wumpus Derrotados: ").append(wumpusDerrotados);
		sb.append("\n");
		sb.append("Ouros Encontrados: ").append(ourosEncontrados);
		return sb.toString();
	}

}
