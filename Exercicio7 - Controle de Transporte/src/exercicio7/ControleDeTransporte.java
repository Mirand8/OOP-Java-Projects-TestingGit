package exercicio7;

public class ControleDeTransporte {

	public static void main(String[] args) {
		
		Moto carga1 = new Moto("moto", 1, 10.5);
		Caminhao carga2 = new Caminhao("caminhao", 3, 1000.0);
		Barco carga3 = new Barco("barco", 5, 1500.0);
		Aviao carga4 = new Aviao("aviao", 10, 2000.0);
		
		carga1.printRelatorio();
		carga2.printRelatorio();
		carga3.printRelatorio();
		carga4.printRelatorio();
	}

}
