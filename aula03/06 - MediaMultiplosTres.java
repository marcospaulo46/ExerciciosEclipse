package br.com.generation.exercicios0507;

/* Exercício 06
 Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class MediaMultiplosTres {

	public static void main(String[] args) {

		// Scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		int numero = 0, soma = 0;
		double media = 0, contador =0;

		// O programa irá rodar enquanto o usuário irá informar um número
		do {
			System.out.print("Informe um nº para cálculo da média (quando desejar finalizar a soma digite 0): ");
			numero = reader.nextInt();

			// Se o resto da divisão do número por 3 for igual a zero e o número for diferente de 0
			if (numero % 3 == 0 && numero != 0) {
				// O número será somado junto a variável soma
				soma += numero;
				// Será feita a contagem (unitária) para cada número que atender a condição if
				contador++;
				// Cálculo a média de valores
				media = soma / contador;
			}
			
		}

		// É necessário que o número informado pelo usuário seja diferente de 0
		while (numero != 0);

		// Impressão da média
		System.out.println("A média dos múltiplos de 3 é: " + media);
		
		// Fechamento do scanner
		reader.close();

	}

}
