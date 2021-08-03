package exercicio6;

public class Cliente {
	private double saldo;
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void saque(double valor) {
		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo Insuficiente!");
		} else this.saldo -= valor;
	}
	
	public void deposita(double valor) {
		if ( valor < 0) {
			throw new IllegalArgumentException("Operação ilegal. O valor informado é negativo!");
		} else this.saldo += valor;
	}
}
