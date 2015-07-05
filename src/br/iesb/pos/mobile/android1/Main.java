package br.iesb.pos.mobile.android1;

public class Main {

	public static void main(String[] args) {

		int quantidadeSalasPorLado = 4;
		int quantidadeDeWumpus = 1;
		int quantidadeCova = 3;
		int quantidadeFlecha = 1;
		int quantidadeOuro = 1;
		MundoWumpus mundoWumpus = new MundoWumpusBuilder()
				.quantidadeSalasPorLado(quantidadeSalasPorLado).quantidadeDeWumpus(quantidadeDeWumpus)
				.quantidadeCova(quantidadeCova).quantidadeFlecha(quantidadeFlecha).quantidadeOuro(quantidadeOuro)
				.criar();
		
		System.out.println(mundoWumpus);
		
		Resultado resultado = mundoWumpus.andar(Direcao.CIMA);
		resultado = mundoWumpus.atirar(Direcao.CIMA);

	}

}
