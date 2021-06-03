package aulajavageneretion;



import java.util.Scanner ;
public class Exercicio_1
 {
	
	
	public static void main (String[] args) { 
	Scanner ler =new Scanner(System.in);{
	int meses, dias , totaldias = 0, anos ;
	
	System.out.println("Digite quantos anos: ");
	 anos = ler.nextInt();
	 System.out.println("Digite quantos meses: ");
	 meses = ler.nextInt();
	 System.out.println("Digite quantos dias : ");
	 dias = ler.nextInt();
	 
	 			totaldias = totaldias + (anos*365);
				totaldias = totaldias + (meses*30);
				totaldias = totaldias + dias ;
				
				System.out.println("O total de dias é: " + totaldias);


	 
	}

		
	}}

