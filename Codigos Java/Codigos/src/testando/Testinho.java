package testando;

import java.util.Scanner;

public class Testinho {

	public static void metodoDeModulo(int a , int b){
		System.out.println(a%b);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os numeros a serem modulados");
		int nUm = scan.nextInt();
		int nDois = scan.nextInt();
		metodoDeModulo(nUm, nDois);
		
	}

}
