package br.com.generation.exercicios0507;

/* Exerc�cio 02
Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

import java.util.Scanner;

public class NumerosParesImpares {

	public static void main(String[] args) {

		// Scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		int numero = 0, contadorpar = 0, contadorimpar = 0;

		// O usu�rio ir� informar 10 n�meros, conforme o contador
		for (int contador = 1; contador <= 10; contador++) {
			System.out.print("Informe o " + contador + "� n�mero: ");
			numero = reader.nextInt();

			// Se o resto da divis�o do n�mero por 2 for igual a 0, ser� armazenado + 1 no contador de n�meros pares
			if (numero % 2 == 0) {
				contadorpar++;
				// Caso contr�rio, ser� armazenado + 1 no contador de n�meros �mpares
			} else {
				contadorimpar++;
			}

		}
		// Impress�o da quantidade de n�meros pares e �mpares
		System.out.println("Quantidade de n�meros pares: " + contadorpar++);
		System.out.println("Quantidade de n�meros �mpares: " + contadorimpar++);

		// Fechamento do scanner
		reader.close();
	}

}
