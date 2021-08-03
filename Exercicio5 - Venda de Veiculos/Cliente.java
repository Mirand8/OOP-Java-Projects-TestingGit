package exercicio5;
import java.util.ArrayList;

public class Cliente{
	private String nome;
	private String email;
	private String cpf;
	private static ArrayList<String> compras = new ArrayList<>();
	private double valorTotalCompra = 0;
	
	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	public void compraCarro(String modelo) {
		double preco = 0;
		if (Carro.listaCarros.contains(modelo) == true) {
			preco = Carro.getListaPrecos().get(Carro.getIndexCarro(modelo));
			this.valorTotalCompra += preco;
			System.out.println("{ O veículo: " + "'" + modelo + "'" + " esta disponível para compra }");
			compras.add(modelo);
			System.out.println(modelo + " foi adicionado a sua lista de compras");
			System.out.println("Valor do carro: " + preco);
			System.out.println("{ " + this.nome + " ja gastou: " + "R$" + this.valorTotalCompra + " }");
			System.out.println("-Compra finalizada");
			
		} else System.out.println("{!! O veículo " + modelo + " não esta disponível para compra }");
	}
}