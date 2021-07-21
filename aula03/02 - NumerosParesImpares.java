package br.com.generation.exercicios0507;

/* Exercício 02
Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

import java.util.Scanner;

public class NumerosParesImpares {

	public static void main(String[] args) {

		// Scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		int numero = 0, contadorpar = 0, contadorimpar = 0;

		// O usuário irá informar 10 números, conforme o contador
		for (int contador = 1; contador <= 10; contador++) {
			System.out.print("Informe o " + contador + "º número: ");
			numero = reader.nextInt();

			// Se o resto da divisão do número por 2 for igual a 0, será armazenado + 1 no contador de números pares
			if (numero % 2 == 0) {
				contadorpar++;
				// Caso contrário, será armazenado + 1 no contador de números ímpares
			} else {
				contadorimpar++;
			}

		}
		// Impressão da quantidade de números pares e ímpares
		System.out.println("Quantidade de números pares: " + contadorpar++);
		System.out.println("Quantidade de números ímpares: " + contadorimpar++);

		// Fechamento do scanner
		reader.close();
	}

}
