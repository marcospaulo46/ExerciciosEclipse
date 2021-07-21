package br.com.generation.exercicios0607;

/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
*/
	
import java.util.Scanner;

public class LancamentoDezVetores {

	public static void main(String[] args) {

		// Abertura do scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		// Declaração do vetor dados com 10 posições --> índices [0][1][2][3][4][5][6][7][8][9]
		double dados[] = new double[10], media = 0.0, maiorPontuacao = 0.0;
		int i, contador = 0;

		// Impressão de título
		System.out.println("Vetor Lançamento de Dados");
		System.out.println("-------------------------");

		// O laço for irá percorrer pelos índices
		for (i = 0; i < dados.length; i++) {
			// O usuário deve informar o valor dos dados
			System.out.print("Informe o valor do " + (i + 1) + "º dado: ");
			// Será informado o valor do dado de acordo com o índice e a mesmo será armazenado
			dados[i] = reader.nextDouble();

			// O valores dos dados serão somados, divididos pela quantidade de posições e armazenados na variável média
			media += dados[i] / dados.length;

			// Se o valor do dado for maior que a maior pontuação (0)
			if (dados[i] > maiorPontuacao) {
				// Este será armazenado na variável maiorPontuacao
				maiorPontuacao = dados[i];
				// O contador fica no zero para caso haja alguma pontuação que sobresaia a outra, ele seja iniciado novamente
				contador = 0;
			}
			// Se o valor do dado for igual a maior pontuação
			if (dados[i] == maiorPontuacao) {
				// É adicionado + 1 no contador
				contador++;
			}
		
		}

		// Pular uma linha
		System.out.println();

		// Impressão de título
		System.out.println("Dados Lançados:");

		// O for foi acionado para que percorra pelos índices
		for (i = 0; i < dados.length; i++) {
			// E imprima as pontuações informadas pelo usuário
			System.out.print(dados[i] + " | ");
		}

		// Pular uma linha
		System.out.println();

		// Impressão da média aritmética
		System.out.printf("\nA média aritmética dos lançamentos é: %.2f", media);

		// Pular uma linha
		System.out.println();

		// Impressão de ocorrência da maior pontuação
		System.out.println("\nA ocorrência da maior pontuação é: " + contador++);
		

	}

}
