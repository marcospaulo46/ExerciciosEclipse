package br.com.generation.exercicios0607;

/* Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */

import java.util.Scanner;

public class VetorLeituraMaiorPontuacao {

	public static void main(String[] args) {

		// Abertura do scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		// Declara��o do vetor pontua��o com 5 posi��es --> �ndices [0][1][2][3][4]
		double pontuacao[] = new double[5], maiorPontuacao = 0.0;
		int i;
		
		// Impress�o de t�tulo
		System.out.println("Vetor Pontua��es de Atividade");
		System.out.println("-----------------------------");

		// O la�o for ir� percorrer pelos �ndices
		for (i = 0; i < pontuacao.length; i++) {
			// O usu�rio deve informar as pontua��es
			System.out.print("Informe a " + (i + 1) + "� pontua��o: ");
			// Ser� informada a pontua��o de acordo com o �ndice e a mesma ser� armazenada
			pontuacao[i] = reader.nextDouble();
		}

		// Pular uma linha
		System.out.println();

		// Impress�o de t�tulo
		System.out.println("Vetor:");

		// O for foi acionado para que percorra pelos �ndices
		for (i = 0; i < pontuacao.length; i++) {
			// E imprima as pontua��es informadas pelo usu�rio
			System.out.print(pontuacao[i] + " | ");

			// Se o valor que est� dentro de qualquer �ndice for maior que a maior pontua��o, este ser� armazenado na vari�vel maiorPontuacao
			if (pontuacao[i] > maiorPontuacao) {
				maiorPontuacao = pontuacao[i];
			}

		}

		// Pular uma linha
		System.out.println();

		// Impress�o da maior pontua��o
		System.out.println("\nA maior pontua��o �: " + maiorPontuacao);
	}

}
