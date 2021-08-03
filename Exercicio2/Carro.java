package exercicio2;

public class Carro{
	private String descricao;
	private String placa;
	private int horarioEntrada; //só a hora
	private int horarioSaida; //só a hora
	private static int preco = 11;
	
	
	public Carro(String descricao, String placa,int horarioEntrada, int horarioSaida) {
		this.descricao = descricao;
		this.placa = placa;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}
	
	public double valorDePermanencia(int horarioEntrada, int horarioSaida) {
		double quantidadeAPagar = 0;
		int horaTotal = horarioSaida - horarioEntrada;
		
		if (horaTotal == 0) {
			quantidadeAPagar = preco;
		} 
		else if (horaTotal > 0) {
			quantidadeAPagar = preco*3;
			
			if (quantidadeAPagar >= 20) {
				double desconto =  (quantidadeAPagar * 0.05); //5%
				quantidadeAPagar -= desconto;
			}
			else if (quantidadeAPagar > 20 && quantidadeAPagar <= 50) {
				double desconto = (quantidadeAPagar * 0.10); //10%
				quantidadeAPagar -= desconto;
			}
			else if (quantidadeAPagar > 50) {
				double desconto = (quantidadeAPagar * 0.20); //20%
				quantidadeAPagar -= desconto;
			}
		}
		return quantidadeAPagar;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public String getPlaca() {
		return placa;
	}
	public int getHorarioEntrada() {
		return horarioEntrada;
	}
	public int getHorarioSaida() {
		return horarioSaida;
	}
	
}