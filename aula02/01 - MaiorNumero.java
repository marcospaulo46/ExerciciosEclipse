package br.com.generation.exercicios0207;

/* Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. */

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int contador, numero, maiorNumero = 0;

		for (contador = 0; contador < 3; contador++) {
			System.out.println("Informe o " + (contador + 1) + "� n�mero: ");
			numero = reader.nextInt();

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		System.out.println("O maior n�mero �: " + maiorNumero + ".");
	}
}