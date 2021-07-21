package br.com.generation.exercicios0207;

/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado. */

import java.util.Scanner;

public class ParImparRaizPotencia {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		double numero, raiz, quadrado;

		System.out.println("Informe um n�: ");
		numero = reader.nextDouble();

		if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("O n�mero " + numero + " � par e sua raiz quadrada � igual a " + raiz + ".");
		} else if (numero % 2 == 1) {
			quadrado = Math.pow(numero, 2);
			System.out.println("O n�mero " + numero + " � �mpar e o seu quadrado � igual a " + quadrado + ".");
		}
		reader.close();
	}
}
