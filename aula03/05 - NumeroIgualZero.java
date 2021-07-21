package br.com.generation.exercicios0507;

/*Exercício 05
Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class NumeroIgualZero {

	public static void main(String[] args) {
		
		// Scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);
		
		int numero = 0, armazenagem = 0;
		
		// O programa vai receber um número do teclado e somá-lo na variável armazenagem
		do {
			System.out.print("Informe um nº para a soma (quando desejar finalizar a soma digite 0): ");
			numero = reader.nextInt();
			armazenagem += numero;
		}
		// O programa irá rodar enquanto o número informado pelo usuário for diferente de 0
		while(numero != 0);
		
		// Impressão da soma dos números armazenados
		System.out.println("A soma dos números digitados é: " + armazenagem);
		
		// Fechamento do scanner
		reader.close();
	}

}
