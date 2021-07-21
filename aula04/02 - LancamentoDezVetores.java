package br.com.generation.exercicios0607;

/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
*/
	
import java.util.Scanner;

public class LancamentoDezVetores {

	public static void main(String[] args) {

		// Abertura do scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		// Declara��o do vetor dados com 10 posi��es --> �ndices [0][1][2][3][4][5][6][7][8][9]
		double dados[] = new double[10], media = 0.0, maiorPontuacao = 0.0;
		int i, contador = 0;

		// Impress�o de t�tulo
		System.out.println("Vetor Lan�amento de Dados");
		System.out.println("-------------------------");

		// O la�o for ir� percorrer pelos �ndices
		for (i = 0; i < dados.length; i++) {
			// O usu�rio deve informar o valor dos dados
			System.out.print("Informe o valor do " + (i + 1) + "� dado: ");
			// Ser� informado o valor do dado de acordo com o �ndice e a mesmo ser� armazenado
			dados[i] = reader.nextDouble();

			// O valores dos dados ser�o somados, divididos pela quantidade de posi��es e armazenados na vari�vel m�dia
			media += dados[i] / dados.length;

			// Se o valor do dado for maior que a maior pontua��o (0)
			if (dados[i] > maiorPontuacao) {
				// Este ser� armazenado na vari�vel maiorPontuacao
				maiorPontuacao = dados[i];
				// O contador fica no zero para caso haja alguma pontua��o que sobresaia a outra, ele seja iniciado novamente
				contador = 0;
			}
			// Se o valor do dado for igual a maior pontua��o
			if (dados[i] == maiorPontuacao) {
				// � adicionado + 1 no contador
				contador++;
			}
		
		}

		// Pular uma linha
		System.out.println();

		// Impress�o de t�tulo
		System.out.println("Dados Lan�ados:");

		// O for foi acionado para que percorra pelos �ndices
		for (i = 0; i < dados.length; i++) {
			// E imprima as pontua��es informadas pelo usu�rio
			System.out.print(dados[i] + " | ");
		}

		// Pular uma linha
		System.out.println();

		// Impress�o da m�dia aritm�tica
		System.out.printf("\nA m�dia aritm�tica dos lan�amentos �: %.2f", media);

		// Pular uma linha
		System.out.println();

		// Impress�o de ocorr�ncia da maior pontua��o
		System.out.println("\nA ocorr�ncia da maior pontua��o �: " + contador++);
		

	}

}
