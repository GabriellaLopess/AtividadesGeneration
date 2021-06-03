package aulajavageneretion;
 import java.util.Scanner;	
public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b , c , r, s , d ;
	
	System.out.println("Escreva A");
		a = ler.nextInt() ; 	
		
			System.out.println("Escreva B");
				b = ler.nextInt() ; 
				
				
				System.out.println("Escreva C");
				c = ler.nextInt() ; 
				
						r = (a + b) * ( a + b) ;
						s = (b + c) * ( b + c);
						d = (r + s) / 2 ;
						
						System.out.println("O resultado é: " + d);

	}

}
