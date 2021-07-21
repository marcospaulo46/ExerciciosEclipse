package br.com.generation.atividades01;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		double a, b, c, r, s, d;
		
		System.out.println("Entre com o valor de A: ");
		a = ler.nextDouble();
		
		System.out.println("Entre com o valor de B: ");
		b = ler.nextDouble();
		
		System.out.println("Entre com o valor de C: ");
		c = ler.nextDouble();
				
		r =  Math.pow((a + b), 2.0);
		s =  Math.pow((b+c), 2.0);
		
		d = (r + s) / 2;
		
		System.out.println("O resultado de D é: " + d);
		

	}

}
