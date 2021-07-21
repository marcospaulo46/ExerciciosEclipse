package br.com.generation.exercicios0607;

/* Crie um programa que receba valores do usu�rio para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal. */

import java.util.Scanner;

public class MatrizTresPorTres {

	public static void main(String[] args) {

		// Abertura do scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		// Declara��o das matrizes com 3 linhas e 3 colunas
		int M3[][] = new int[3][3], l, c, soma = 0, somaDiagonal = 0;

		// Impress�o de t�tulo
		System.out.println("Matriz 3x3");
		System.out.println("----------");

		// O for ser� executado at� que a linha atinja o �ndice 2
		for (l = 0; l < M3.length; l++) {
			// O for interno ir� percorrer as colunas at� que se antija o �ndice 2
			for (c = 0; c < M3[l].length; c++) {
				// Quando o programa rodar, ser� solicitado para o usu�rio informar um valor para a linha 0 e colunas 0, 1 e 2
				System.out.printf("Informe um n� para M3 [%d][%d]: ", l, c);
				// Os valores ser�o armazenados em M3
				M3[l][c] = reader.nextInt();

				// O valor de cada linha-coluna ser� agregado(somado) na vari�vel soma
				soma += M3[l][c];

				// Se o �ndice da linha for igual ao �ndice da coluna
				if (M3[l] == M3[c]) {
					// O valor ser� agregado(somado) na vari�vel somaDiagonal
					somaDiagonal += M3[l][c];
				}
			}
		}

		// Pular uma linha
		System.out.println();

		// Ser� impresso o valor da soma
		System.out.println("A soma da matriz 3x3 �: " + soma);

		// Pular uma linha
		System.out.println();

		// Ser� impresso valor da soma da diagonal principal
		System.out.println("A soma da diagonal principal �: " + somaDiagonal);

	}

}
