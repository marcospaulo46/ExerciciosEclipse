package br.com.generation.exercicios0607;

/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/

import java.util.Scanner;

public class DuasMatrizes {

	public static void main(String[] args) {

		// Abertura do scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		// Declaração das matrizes com 4 linhas e 6 colunas
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		int l, c;

		// Impressão de título
		System.out.println("Matrizes");
		System.out.println("--------");

		// O for será executado até que a linha atinja o índice 3
		for (l = 0; l < N1.length; l++) {
			// O for interno será executado por cada linha até que a coluna antija o índice 5
			for (c = 0; c < N1[l].length; c++) {
				// Quando o programa rodar, será solicitado para o usuário informar um valor para a linha índice 0 e colunas índices 0, 1, 2, 3, 4 e 5
				System.out.printf("Informe um número para N1 [%d][%d]: ", l, c);
				// Os valores serão armazenados em N1
				N1[l][c] = reader.nextInt();
				// Os valores serão armazenados em N2
				System.out.printf("Informe um número para N2 [%d][%d]: ", l, c);
				N2[l][c] = reader.nextInt();

				// Em M1, o programa também vai rodar pela linha índice 0 e colunas índices 0, 1, 2, 3, 4 e 5, tanto de N1 como N2
				// Nesta parte, serão extraídos os valores armazenados em N1[l][c] e N2[l][c] que foram digitados pelo usuário e será feita a soma desses valores
				// Em M1[l][c] será armazenada a soma dos valores de N1 e N2 considerando a respectiva linha x coluna
				M1[l][c] = N1[l][c] + N2[l][c];
				// Em M2, o programa também vai rodar pela linha índice 0 e colunas índices 0, 1, 2, 3, 4 e 5, tanto de N1 como N2
				// Nesta parte, serão extraídos os valores armazenados em N1[l][c] e N2[l][c] que foram digitados pelo usuário e será feita a subtração desses valores
				// Em M1[l][c] será armazenada a subtração dos valores de N1 e N2 considerando a respectiva linha x coluna
				M2[l][c] = N1[l][c] - N2[l][c];

			}
		}

		// Pular uma linha
		System.out.println();

		// Impressão de título
		System.out.println("Valores das matrizes M1 e M2:");

		// O for irá percorrer pela linha
		for (l = 0; l < N1.length; l++) {
			// O for interno irá percorrer pelas colunas
			for (c = 0; c < N1[l].length; c++) {
				// Serão impressos os valores armazenados em M1
				System.out.printf("Soma da matriz M1 " + "[" + l + "]" + "[" + c + "]" + " = " + M1[l][c] + "\n");
				// Serão impressos os valores armazenados em M2
				System.out.printf("Subtração da matriz M2 " + "[" + l + "]" + "[" + c + "]" + " = " + M2[l][c] + "\n");

			}
		}
	}
}
