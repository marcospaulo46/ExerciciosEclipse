package br.com.generation.aula07;

public class TestaAnimais {
	 public static void main(String[] args) {
	        
	        Cachorro dog1 = new Cachorro();
	        Cavalo horse1 = new Cavalo();
	        Preguica preg1 = new Preguica();
	        Gato cat1 = new Gato();
	        
	        System.out.println("=====Dados Cachorro=====");
	        dog1.nome();
	        dog1.idade();
	        dog1.pelo();
	        dog1.emiteSom();
	        dog1.cor();
	        dog1.corre();
	        
	        System.out.println("\n=====Dados Cavalo=====");
	        horse1.nome();
	        horse1.idade();
	        horse1.pelo();
	        horse1.emiteSom();
	        horse1.cor();
	        horse1.corre();
	        
	        System.out.println("\n=====Dados Pregui�a=====");
	        preg1.nome();
	        preg1.idade();
	        preg1.pelo();
	        preg1.emiteSom();
	        preg1.cor();
	        preg1.subirArvore();
	        
	        System.out.println("\n=====Dados Gato=====");
	        cat1.nome();
	        cat1.idade();
	        cat1.pelo();
	        cat1.emiteSom();
	        cat1.cor();
	        

	    }

	}