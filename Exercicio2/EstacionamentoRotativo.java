package exercicio2;

public class EstacionamentoRotativo {
	public static void main(String[] args) {
		Carro carro1 = new Carro("golf", "abc-123", 13, 18);
		
		System.out.println("Tipo do carro = " + carro1.getDescricao());
		System.out.println("Placa = " + carro1.getPlaca());
		System.out.println("Hora de Entrada: " + carro1.getHorarioEntrada());
		System.out.println("Hora de Saida: " + carro1.getHorarioSaida());
		System.out.println("Valor a Pagar: R$" + carro1.valorDePermanencia(carro1.getHorarioEntrada(), carro1.getHorarioSaida()));
		
	}
}
