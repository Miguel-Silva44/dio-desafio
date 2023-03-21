public class Carro extends atributos {
	
	
	Carro( ){
	}
	
	public static void metodoCriador(Carro a){
		 a.estacionamentos(a);
	}
	
	public static void estacionamentos(Carro a){
		System.out.println();
		System.out.println("O carro estacionado é: "+a.cor);
		System.out.println("O carro estacionado tem a placa: "+a.placa);
		System.out.println("O carro estacionado tem a velocidade max de: "+a.vM);
	}
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.placa=7284;
		carro1.cor="Azul";
		carro1.vM=120;
		carro1.metodoCriador(carro1);
		
		Carro carro2 = new Carro();
		carro2.placa=1756;
		carro2.cor="Vermelho";
		carro2.vM=220;
		carro2.metodoCriador(carro2);
	
		Carro carro3 = new Carro();
		carro3.placa=2343;
		carro3.cor="Verde";
		carro3.vM=330;
		carro2.metodoCriador(carro3);
	
	}
}
