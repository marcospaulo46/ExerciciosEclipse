package br.com.generation.exercicios0507;

/* Exerc�cio 06
 Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class MediaMultiplosTres {

	public static void main(String[] args) {

		// Scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		int numero = 0, soma = 0;
		double media = 0, contador =0;

		// O programa ir� rodar enquanto o usu�rio ir� informar um n�mero
		do {
			System.out.print("Informe um n� para c�lculo da m�dia (quando desejar finalizar a soma digite 0): ");
			numero = reader.nextInt();

			// Se o resto da divis�o do n�mero por 3 for igual a zero e o n�mero for diferente de 0
			if (numero % 3 == 0 && numero != 0) {
				// O n�mero ser� somado junto a vari�vel soma
				soma += numero;
				// Ser� feita a contagem (unit�ria) para cada n�mero que atender a condi��o if
				contador++;
				// C�lculo a m�dia de valores
				media = soma / contador;
			}
			
		}

		// � necess�rio que o n�mero informado pelo usu�rio seja diferente de 0
		while (numero != 0);

		// Impress�o da m�dia
		System.out.println("A m�dia dos m�ltiplos de 3 �: " + media);
		
		// Fechamento do scanner
		reader.close();

	}

}
