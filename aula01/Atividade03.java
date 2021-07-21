package br.com.generation.atividades01;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int seg, min, hora;
		int segundos;
		
		System.out.println("Olá, diga a quantidade de segundos que durou o evento: ");
		segundos = ler.nextInt();
				
		hora = segundos / 3600;
		min = segundos % 3600 / 60;
		seg = segundos % 3600 % 60;
		
		System.out.println("No total: " + hora + " horas, " + min + " minutos e " + seg + " segundos");

	}

}
