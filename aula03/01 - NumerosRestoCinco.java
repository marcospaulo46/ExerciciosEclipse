package br.com.generation.exercicios0507;

/*Exercício 01
 1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 */

public class NumerosRestoCinco {

	public static void main(String[] args) {

		// Início em 1000, condição para ir até 1999 e acrescentar + 1 a cada loop
		for (int numero = 1000; numero <= 1999; numero++) {

			// Se o resto da divisão do número por 11 for igual a 5, o número será impresso na tela
			if (numero % 11 == 5) {
				System.out.println(numero);
			}
		}

	}

}
