package br.com.generation.exercicios0507;

/*Exerc�cio 05
Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class NumeroIgualZero {

	public static void main(String[] args) {
		
		// Scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);
		
		int numero = 0, armazenagem = 0;
		
		// O programa vai receber um n�mero do teclado e som�-lo na vari�vel armazenagem
		do {
			System.out.print("Informe um n� para a soma (quando desejar finalizar a soma digite 0): ");
			numero = reader.nextInt();
			armazenagem += numero;
		}
		// O programa ir� rodar enquanto o n�mero informado pelo usu�rio for diferente de 0
		while(numero != 0);
		
		// Impress�o da soma dos n�meros armazenados
		System.out.println("A soma dos n�meros digitados �: " + armazenagem);
		
		// Fechamento do scanner
		reader.close();
	}

}
