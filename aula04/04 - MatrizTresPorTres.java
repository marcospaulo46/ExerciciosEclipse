package br.com.generation.exercicios0607;

/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal. */

import java.util.Scanner;

public class MatrizTresPorTres {

	public static void main(String[] args) {

		// Abertura do scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		// Declaração das matrizes com 3 linhas e 3 colunas
		int M3[][] = new int[3][3], l, c, soma = 0, somaDiagonal = 0;

		// Impressão de título
		System.out.println("Matriz 3x3");
		System.out.println("----------");

		// O for será executado até que a linha atinja o índice 2
		for (l = 0; l < M3.length; l++) {
			// O for interno irá percorrer as colunas até que se antija o índice 2
			for (c = 0; c < M3[l].length; c++) {
				// Quando o programa rodar, será solicitado para o usuário informar um valor para a linha 0 e colunas 0, 1 e 2
				System.out.printf("Informe um nº para M3 [%d][%d]: ", l, c);
				// Os valores serão armazenados em M3
				M3[l][c] = reader.nextInt();

				// O valor de cada linha-coluna será agregado(somado) na variável soma
				soma += M3[l][c];

				// Se o índice da linha for igual ao índice da coluna
				if (M3[l] == M3[c]) {
					// O valor será agregado(somado) na variável somaDiagonal
					somaDiagonal += M3[l][c];
				}
			}
		}

		// Pular uma linha
		System.out.println();

		// Será impresso o valor da soma
		System.out.println("A soma da matriz 3x3 é: " + soma);

		// Pular uma linha
		System.out.println();

		// Será impresso valor da soma da diagonal principal
		System.out.println("A soma da diagonal principal é: " + somaDiagonal);

	}

}
