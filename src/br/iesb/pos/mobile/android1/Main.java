package br.iesb.pos.mobile.android1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String instrucoes = "MOVIMENTOS: 8 - cima; 4 - esquerda; 2 - baixo; 6 - direita; 0 - sair\n"
            + "LEGENDA: A - agente; O - ouro; C - cova; B - brisa; W - wumpus; F - fedor;\n\n" + "MOVIMENTO (seguido da tecla Enter) ==>> ";

    public static void main(String[] args) throws IOException {

        int quantidadeSalasPorLado = 4;
        int quantidadeDeWumpus = 1;
        int quantidadeCova = 3;
        int quantidadeFlecha = 1;
        int quantidadeOuro = 1;
        MundoWumpus mundoWumpus = new MundoWumpusBuilder().quantidadeSalasPorLado(quantidadeSalasPorLado)
                .quantidadeDeWumpus(quantidadeDeWumpus).quantidadeCova(quantidadeCova).quantidadeFlecha(quantidadeFlecha)
                .quantidadeOuro(quantidadeOuro).criar();

        System.out.print("\n\nSeja Bem-Vindo(a) ao Mundo de Wumpus! ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Resultado resultado = null;
        while (resultado == null || !resultado.gameOver()) {
            System.out.println("\n__________________________________________________________________________________");
            System.out.println(mundoWumpus.exibirParcial());
            System.out.print(instrucoes);

            Direcao direcao = lerMovimento(reader.readLine());

            resultado = mundoWumpus.andarPara(direcao);
            if (resultado.movimentoValido()) {
                System.out.println("Resultado do Movimento: " + resultado);
            } else {
                System.err.print("Movimento invalido!\n\n");
            }

        }

        boolean venceu = resultado.venceu();
        System.out.println("__________________________________________________________________________________");
        System.out.println("\n\t\t\t\tFIM DE JOGO\n\n\n");
        System.out.println(mundoWumpus.exibirTudo());
        System.out.println("\n\n\t\t\t\tVOCE " + (venceu ? "VENCEU" : "PERDEU"));
        System.out.println("__________________________________________________________________________________");

    }

    private static Direcao lerMovimento(String linha) {
        if ("0".equalsIgnoreCase(linha)) {
            System.exit(1);
        } else if ("8".equalsIgnoreCase(linha)) {
            return Direcao.CIMA;
        } else if ("4".equalsIgnoreCase(linha)) {
            return Direcao.ESQUERDA;
        } else if ("2".equalsIgnoreCase(linha)) {
            return Direcao.BAIXO;
        } else if ("6".equalsIgnoreCase(linha)) {
            return Direcao.DIREITA;
        }
        return Direcao.MOVIMENTO_INVALIDO;
    }

}
