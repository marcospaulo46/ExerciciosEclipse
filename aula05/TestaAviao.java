package br.com.generation.aula05;

public class TestaAviao {

	public static void main(String[] args) {
        Aviao aviao1 = new Aviao();
        
        aviao1.setTipo("Boeing");
        aviao1.setTipoCombustivel("Querosene de avia��o");
        aviao1.setClasse("Executivo");
        aviao1.setComportacao(150);
        aviao1.setVelocidadeDecolagem(900);
        aviao1.setVelocidadeMaxima(252);
        
        aviao1.decolagem();
        
        System.out.println("\nO tipo do avi�o �: " + aviao1.getTipo());
        System.out.println("O tipo de combust�vel �: " + aviao1.getTipoCombustivel());
        System.out.println("A classe do avi�o: " + aviao1.getClasse());
        System.out.println("O avi�o comporta: " + aviao1.getComportacao() + " pessoas");
        System.out.println("\nA velocidade m�xima que um avi�o pode atingir � de: " + aviao1.getVelocidadeDecolagem() + "km/h");
        System.out.println("A velocidade de decolagem m�dia de um avi�o � de: " + aviao1.getVelocidadeMaxima() + "km/h");
    }
}