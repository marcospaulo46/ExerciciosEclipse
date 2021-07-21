package br.com.generation.exercicios0207;

/* Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado. */

import java.util.Scanner;

public class ParImparRaizPotencia {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		double numero, raiz, quadrado;

		System.out.println("Informe um nº: ");
		numero = reader.nextDouble();

		if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("O número " + numero + " é par e sua raiz quadrada é igual a " + raiz + ".");
		} else if (numero % 2 == 1) {
			quadrado = Math.pow(numero, 2);
			System.out.println("O número " + numero + " é ímpar e o seu quadrado é igual a " + quadrado + ".");
		}
		reader.close();
	}
}
