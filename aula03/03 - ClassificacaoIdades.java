package br.com.generation.exercicios0507;

/* Exercício 03
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
*/

import java.util.Scanner;

public class ClassificacaoIdades {

	public static void main(String[] args) {

		// Scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		int idade = 0, menosde21 = 0, maisde50 = 0;

		// Enquanto a idade for diferente de -99, o usuário poderá/terá que informar uma idade qualquer
		while (idade != -99) {
			System.out.print("Informe uma idade diferente de -99 anos: ");
			idade = reader.nextInt();

			// Se a idade informada pelo usuário for maior de 0 e menor que 21, será armazenado + 1 no contador de idades menores que 21 anos
			if (idade > 0 && idade < 21) {
				menosde21++;
				// Caso contrário, se a idade for maior que 50, será armazenado + 1 no contador de idades maiores que 50 anos
			} else if (idade > 50) {
				maisde50++;
			}
		}
		// Impressão da quantidade de idades menores que 21 e maiores que 50 anos
		System.out.println("Total de pessoas com menos de 21 anos: " + menosde21++);
		System.out.println("Total de pessoas com mais de 50 anos: " + maisde50++);

		// Fechamento do scanner
		reader.close();
	}

}
