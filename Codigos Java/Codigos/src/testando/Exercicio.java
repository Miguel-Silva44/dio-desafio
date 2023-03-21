package testando;

import java.util.Scanner;

public class Exercicio {

	public static void calcTrimestrePassado(int a,int b,int c){
		System.out.println("Os gastos do ultimo trimestres foram: \nMes 1: "+ a+"\nMes 2: " +b+"\nMes 3: " + c);
		System.out.println("Com uma media de: "+(a+b+c)/3);
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os Gastos do 1o mes");
		int mesUm = scan.nextInt();
		System.out.println("Digite os Gastos do 2o mes");
		int mesDois = scan.nextInt();
		System.out.println("Digite os Gastos do 3o mes");
		int mesTres = scan.nextInt();
		calcTrimestrePassado(mesUm, mesDois, mesTres);

	}

}
