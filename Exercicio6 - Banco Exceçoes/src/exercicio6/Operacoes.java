package exercicio6;

public class Operacoes {
	public static void main(String[] args) {
		Cliente matheus = new Cliente("matheus");
		
		System.out.println(matheus.getSaldo());
		matheus.saque(10.0);
		matheus.saque(-100.0);
		matheus.deposita(-100);
		System.out.println(matheus.getSaldo());
		
	}
}
