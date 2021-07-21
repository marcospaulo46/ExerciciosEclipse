package br.com.generation.atividades01;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculadora de dias de vida\n" + "\nDigite a sua idade: ");
		idadeAnos = ler.nextInt();
		
		System.out.println("Digite os meses: ");
		idadeMeses = ler.nextInt();
		
		System.out.println("Digite os dias: ");
		idadeDias = ler.nextInt();
		
		resultado = ((idadeAnos * 365) + (idadeMeses * 30) + idadeDias);
		
		System.out.println("Você possui: " + resultado + " dias de vida!");
	}

}
