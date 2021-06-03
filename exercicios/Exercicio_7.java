package aulajavageneretion;
import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[] args){
	double a, b ,c ,d , e , f,x , y ;
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Digite aqui o A");
	a = leia.nextDouble() ; 
	System.out.println("Digite aqui o B");
	b = leia.nextDouble() ; 
	System.out.println("Digite aqui o C");
	c = leia.nextDouble() ; 
	System.out.println("Digite aqui o D");
	d = leia.nextDouble() ; 
	System.out.println("Digite aqui o E");
	e = leia.nextDouble() ; 
	System.out.println("Digite aqui o F");
	f = leia.nextDouble() ; 
	
			x = ((c *e) - (b * f)) / (( a * e) - (b*d));
	         y = (( a*f) - (c*d)) / ((a*e) - (b*d));
	         
	         
	         System.out.println("O valor de x é: " + x);
	         System.out.println("O valor de y é: " + y );
	}

}
