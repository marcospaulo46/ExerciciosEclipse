package br.com.generation.aula07;

public class Gato implements Animal{

	@Override
	public void nome() {
		System.out.println("Nome: Jhin");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade: 8 meses");
		
	}

	@Override
	public void pelo() {
		System.out.println("Pelo: Sim");
		
	}

	@Override
	public void emiteSom() {
		System.out.println("Som: Miau Miau");
		
	}

	@Override
	public void cor() {
		System.out.println("Cor: Branco e Cinza");
		
	}

}
