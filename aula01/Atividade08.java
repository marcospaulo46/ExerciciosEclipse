package br.com.generation.atividades01;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valorFab, valor;
		
		System.out.println("Qual o valor de fabrica? ");
		valorFab = ler.nextDouble();
		
		valor = valorFab + (valorFab * 0.28) + (valorFab * 0.45);
		
		System.out.println("O valor total do carro é: " + valor);
	}

}
