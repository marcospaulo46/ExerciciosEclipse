package br.com.generation.exercicios0507;

/*Exerc�cio 01
 1-	Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 */

public class NumerosRestoCinco {

	public static void main(String[] args) {

		// In�cio em 1000, condi��o para ir at� 1999 e acrescentar + 1 a cada loop
		for (int numero = 1000; numero <= 1999; numero++) {

			// Se o resto da divis�o do n�mero por 11 for igual a 5, o n�mero ser� impresso na tela
			if (numero % 11 == 5) {
				System.out.println(numero);
			}
		}

	}

}
