package exercicio5;
import java.util.ArrayList;

public class Carro{
	private String modelo;
	private String cor;
	private int anoFabricacao;
	private String transmissao;
	private double preco;
	protected static ArrayList<String> listaCarros = new ArrayList<>();
	protected static ArrayList<Double> listaPrecos = new ArrayList<>();
	
	public Carro(String modelo, String cor, int anoFabricacao, boolean transmissao, double preco){
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		
		if (transmissao == true) {
			this.transmissao = "automatico";
		} else this.transmissao = "manual";
		
		this.preco = preco;
		listaCarros.add(modelo);
		listaPrecos.add(preco);
		System.out.println("Você adicionou " + this.modelo + " a lista de carros!");
		System.out.println("Status: ");
		System.out.println("	Cor: " + this.cor);
		System.out.println("	Ano de Fabricação: " + this.anoFabricacao);
		System.out.println("	Tipo de Transmissão: " + this.transmissao);
		System.out.println("-------------------------------");
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public static ArrayList<String> getListaCarros() {
		return listaCarros;
	}
	
	public static int getIndexCarro(String carro) {
		return listaCarros.indexOf(carro);
	}
	
	public static ArrayList<Double> getListaPrecos() {
		return listaPrecos;
	}
}