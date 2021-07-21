package br.com.generation.exercicios0207;

/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
• 10-14 infantil
• 15-17 juvenil
• 18-25 adulto*/

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int idade;

		System.out.println("Informe a idade: ");
		idade = reader.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("A idade de " + idade + " anos faz parte da categoria infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("A idade de " + idade + " anos faz parte da categoria juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("A idade de " + idade + " anos faz parte da categoria adulto.");
		} else {
			System.out.println("Idade inválida!");
		}		
		reader.close();
	}	
}

