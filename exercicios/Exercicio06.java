package br.com.generation.aula01.correcao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double d, raiz;
		
		System.out.println("Digite o valor de X no 1º Ponto:");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y no 1º Ponto:");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de X no 2º Ponto:");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y no 2º Ponto:");
		y2 = entrada.nextDouble();
		
		d = ((x2-x1) * (x2-x1)) + ((y2-y1) *(y2-y1));
		raiz = Math.sqrt(d);
		
		System.out.println("Potência X e Y: " + d);
		System.out.println("Raiz X e Y: " + raiz);

	}

}
