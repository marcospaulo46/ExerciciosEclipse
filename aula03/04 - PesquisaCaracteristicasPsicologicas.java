package br.com.generation.exercicios0507;

/* Exercício 04
Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.
 */

import java.util.Scanner;

public class PesquisaCaracteristicasPsicologicas {

	public static void main(String[] args) {

		// Scanner para leitura do teclado
		Scanner reader = new Scanner(System.in);

		int pessoas = 1, idade, sexo, temperamento, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,
				outrosCalmos = 0, nervososMaisQuarenta = 0, calmosMenosDezoito = 0;

		// O loop irá acontecer quando a quantidade de pessoas atingir 150 unidades
		while (pessoas <= 150) {

			// O usuário irá informar a idade
			System.out.print("Informe a sua idade: ");
			idade = reader.nextInt();

			// O usuário irá informar o sexo
			System.out.print("Informe (1) para sexo feminino, (2) para sexo masculino ou (3) para outros: ");
			sexo = reader.nextInt();

			// O usuário irá informar o temperamento emocional
			System.out.print(
					"Informe (1) para temperamento calmo, (2) para temperamento nervoso ou (3) para temperamento agressivo: ");
			temperamento = reader.nextInt();

			// Se o temperamento for calmo, será armazenado + 1 contador de pessoas calmas
			if (temperamento == 1) {
				pessoasCalmas++;
			}

			// Se o sexo for feminino e o temperamento nervoso, será armazenado + 1 contador de mulheres nervosas
			if (sexo == 1 && temperamento == 2) {
				mulheresNervosas++;
			}

			// Se o sexo for masculino e o temperamento agressivo, será armazenado + 1 no contador de homens agressivos
			if (sexo == 2 && temperamento == 3) {
				homensAgressivos++;
			}

			// Se o sexo for outros e o temperamento calmo, será armazenado + 1 no contador
			// de outros calmos
			if (sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			}

			// Se o temperamento for agressivo e a idade maior que 40 anos, será armazenado + 1 no contador de nervosos com mais de 40 anos
			if (temperamento == 2 && idade > 40) {
				nervososMaisQuarenta++;
			}

			// Se o temperamento for calmo e a idade menor que 18 anos, será armazenado + 1 no contador de calmos com menos de 18 anos
			if (temperamento == 1 && idade < 18) {
				calmosMenosDezoito++;
			}

			// + 1 para o loop rodar
			pessoas++;

		}
		// Impressão de todas as condições dos if's
		System.out.println("O número de pessoas calmas é: " + pessoasCalmas++);
		System.out.println("O número de mulheres nervosas é: " + mulheresNervosas++);
		System.out.println("O número de homens agressivos é: " + homensAgressivos++);
		System.out.println("O número de outros calmos é: " + outrosCalmos++);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nervososMaisQuarenta++);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + calmosMenosDezoito++);

		// Fechamento do scanner
		reader.close();

	}

}
