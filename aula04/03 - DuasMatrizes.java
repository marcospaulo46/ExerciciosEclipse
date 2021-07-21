package br.com.generation.exercicios0607;

/* Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
 * a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
 * b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.
*/

import java.util.Scanner;

public class DuasMatrizes {

	public static void main(String[] args) {

		// Abertura do scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		// Declara��o das matrizes com 4 linhas e 6 colunas
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		int l, c;

		// Impress�o de t�tulo
		System.out.println("Matrizes");
		System.out.println("--------");

		// O for ser� executado at� que a linha atinja o �ndice 3
		for (l = 0; l < N1.length; l++) {
			// O for interno ser� executado por cada linha at� que a coluna antija o �ndice 5
			for (c = 0; c < N1[l].length; c++) {
				// Quando o programa rodar, ser� solicitado para o usu�rio informar um valor para a linha �ndice 0 e colunas �ndices 0, 1, 2, 3, 4 e 5
				System.out.printf("Informe um n�mero para N1 [%d][%d]: ", l, c);
				// Os valores ser�o armazenados em N1
				N1[l][c] = reader.nextInt();
				// Os valores ser�o armazenados em N2
				System.out.printf("Informe um n�mero para N2 [%d][%d]: ", l, c);
				N2[l][c] = reader.nextInt();

				// Em M1, o programa tamb�m vai rodar pela linha �ndice 0 e colunas �ndices 0, 1, 2, 3, 4 e 5, tanto de N1 como N2
				// Nesta parte, ser�o extra�dos os valores armazenados em N1[l][c] e N2[l][c] que foram digitados pelo usu�rio e ser� feita a soma desses valores
				// Em M1[l][c] ser� armazenada a soma dos valores de N1 e N2 considerando a respectiva linha x coluna
				M1[l][c] = N1[l][c] + N2[l][c];
				// Em M2, o programa tamb�m vai rodar pela linha �ndice 0 e colunas �ndices 0, 1, 2, 3, 4 e 5, tanto de N1 como N2
				// Nesta parte, ser�o extra�dos os valores armazenados em N1[l][c] e N2[l][c] que foram digitados pelo usu�rio e ser� feita a subtra��o desses valores
				// Em M1[l][c] ser� armazenada a subtra��o dos valores de N1 e N2 considerando a respectiva linha x coluna
				M2[l][c] = N1[l][c] - N2[l][c];

			}
		}

		// Pular uma linha
		System.out.println();

		// Impress�o de t�tulo
		System.out.println("Valores das matrizes M1 e M2:");

		// O for ir� percorrer pela linha
		for (l = 0; l < N1.length; l++) {
			// O for interno ir� percorrer pelas colunas
			for (c = 0; c < N1[l].length; c++) {
				// Ser�o impressos os valores armazenados em M1
				System.out.printf("Soma da matriz M1 " + "[" + l + "]" + "[" + c + "]" + " = " + M1[l][c] + "\n");
				// Ser�o impressos os valores armazenados em M2
				System.out.printf("Subtra��o da matriz M2 " + "[" + l + "]" + "[" + c + "]" + " = " + M2[l][c] + "\n");

			}
		}
	}
}
