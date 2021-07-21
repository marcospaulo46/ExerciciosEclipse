package br.com.generation.exercicios0607;

/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

import java.util.Scanner;

public class VetorLeituraMaiorPontuacao {

	public static void main(String[] args) {

		// Abertura do scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		// Declaração do vetor pontuação com 5 posições --> índices [0][1][2][3][4]
		double pontuacao[] = new double[5], maiorPontuacao = 0.0;
		int i;
		
		// Impressão de título
		System.out.println("Vetor Pontuações de Atividade");
		System.out.println("-----------------------------");

		// O laço for irá percorrer pelos índices
		for (i = 0; i < pontuacao.length; i++) {
			// O usuário deve informar as pontuações
			System.out.print("Informe a " + (i + 1) + "ª pontuação: ");
			// Será informada a pontuação de acordo com o índice e a mesma será armazenada
			pontuacao[i] = reader.nextDouble();
		}

		// Pular uma linha
		System.out.println();

		// Impressão de título
		System.out.println("Vetor:");

		// O for foi acionado para que percorra pelos índices
		for (i = 0; i < pontuacao.length; i++) {
			// E imprima as pontuações informadas pelo usuário
			System.out.print(pontuacao[i] + " | ");

			// Se o valor que está dentro de qualquer índice for maior que a maior pontuação, este será armazenado na variável maiorPontuacao
			if (pontuacao[i] > maiorPontuacao) {
				maiorPontuacao = pontuacao[i];
			}

		}

		// Pular uma linha
		System.out.println();

		// Impressão da maior pontuação
		System.out.println("\nA maior pontuação é: " + maiorPontuacao);
	}

}
