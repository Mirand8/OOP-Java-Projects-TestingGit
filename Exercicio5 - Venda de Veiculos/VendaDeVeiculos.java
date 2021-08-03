package exercicio5;

public class VendaDeVeiculos {

	public static void main(String[] args) {
		Carro golf = new Carro("Golf GTI", "preto", 2001, true, 10000.0);
		Carro palio = new Carro("Palio", "azul", 1999, false, 3000.0);
		Carro corsa = new Carro("Corsa", "branco", 1996, false, 5000);
		
		Cliente cutiggi = new Cliente("Vitor", "vitor@email.com", "555555555");
		Cliente matheus = new Cliente("Matheus", "matheus@email.com", "5555555");
		
		cutiggi.compraCarro("Palio");
		matheus.compraCarro("Golf GTI");
		matheus.compraCarro("Corsa");
	}

}
