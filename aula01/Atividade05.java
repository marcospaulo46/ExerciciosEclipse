package br.com.generation.atividades01;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaPon;
		
		System.out.println("Insira a 1° nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Insira a 2°nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Insira a 3°nota: ");
		nota3 = ler.nextDouble();
		
		mediaPon = (2 * nota1 + 3 * nota2 + 5 * nota3) / 10;
		
		System.out.println("A média ponderada é: " + mediaPon);
		

	}

}
