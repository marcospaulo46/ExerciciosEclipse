package br.com.generation.atividades01;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, dias;
		
		System.out.println("Digite a sua idade em dias: ");
		dias = ler.nextInt();
				
		idadeAnos = dias / 365;
		idadeMeses = (dias % 365) / 30;
		idadeDias = (dias % 365) % 30;
		
		System.out.println("A idade é de " +  idadeAnos + " anos, " + idadeMeses + " meses e " + idadeDias + " dias ");
		

	}

}
