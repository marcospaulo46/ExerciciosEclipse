package br.com.generation.atividades01;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double p1, p2;
		double d;
		
		System.out.println("Digite o valor de X do 1° PONTO: ");
		x1 = ler.nextDouble();
		System.out.println("Digite o valor de Y do 1° PONTO: ");
		y1 = ler.nextDouble();
		System.out.println("Digite o valor de X do 2° PONTO: ");
		x2 = ler.nextDouble();
		System.out.println("Digite o valor de Y do 2° PONTO: ");
		y2 = ler.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2.0);
		p2 = Math.pow((y2 - y1), 2.0);
		
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância do P1 para P2 é: " + d);

	}

}
