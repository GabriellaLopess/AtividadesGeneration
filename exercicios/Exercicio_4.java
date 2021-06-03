package aulajavageneretion;


import java.util.Scanner;
public class Exercicio_4 {

	public static void main(String[] args) {
		int segundos, horas , minutos ;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os segundos: ");
		segundos = leia.nextInt() ;
		
				minutos= segundos / 60;
				horas= minutos * 60;
				
				System.out.println("O resultado em minutos é:" + minutos);
				System.out.println("O resultado em horas é: " + horas);


	}

}
