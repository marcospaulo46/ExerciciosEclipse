package br.com.generation.exercicios0207;

/* Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente. */

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		double numero1, numero2, numero3;

		System.out.println("Informe o 1� n�mero: ");
		numero1 = reader.nextDouble();

		System.out.println("Informe o 2� n�mero: ");
		numero2 = reader.nextDouble();

		System.out.println("Informe o 3� n�mero: ");
		numero3 = reader.nextDouble();

		if (numero1 > numero2 && numero1 > numero3) {
			if (numero2 > numero3) {
				System.out.println("Ordem crescente dos n�meros: " + numero3 + ", " + numero2 + " e " + numero1 + ".");
			} else if (numero3 > numero2) {
				System.out.println("Ordem crescente dos n�meros: " + numero2 + ", " + numero3 + " e " + numero1 + ".");
			}
		}

		else if (numero2 > numero1 && numero2 > numero3) {
			if (numero1 > numero3) {
				System.out.println("Ordem crescente dos n�meros: " + numero3 + ", " + numero1 + " e " + numero2 + ".");
			} else if (numero3 > numero1) {
				System.out.println("Ordem crescente dos n�meros: " + numero1 + ", " + numero3 + " e " + numero2 + ".");
			}

			else if (numero3 > numero1 && numero3 > numero2) {
				if (numero1 > numero2) {
					System.out.println(
							"Ordem crescente dos n�meros: " + numero2 + ", " + numero1 + " e " + numero3 + ".");
				} else if (numero2 > numero1) {
					System.out.println(
							"Ordem crescente dos n�meros: " + numero1 + ", " + numero2 + " e " + numero3 + ".");
				}
			}
		}
		reader.close();
	}
}
