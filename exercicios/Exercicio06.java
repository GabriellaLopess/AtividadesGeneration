package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double d, raiz;
		
		System.out.println("Digite o valor de X no 1� Ponto:");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y no 1� Ponto:");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de X no 2� Ponto:");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y no 2� Ponto:");
		y2 = entrada.nextDouble();
		
		d = ((x2-x1) * (x2-x1)) + ((y2-y1) *(y2-y1));
		raiz = Math.sqrt(d);
		
		System.out.println("Pot�ncia X e Y: " + d);
		System.out.println("Raiz X e Y: " + raiz);

	}

}
