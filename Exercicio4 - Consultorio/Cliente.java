package exercicio4;
import java.util.ArrayList;

public class Cliente{
	
	private String nome;
	private int idade;
	private static ArrayList<String> filaPrioritaria = new ArrayList<>();
	private static ArrayList<String> filaComum = new ArrayList<>();
	
	public Cliente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		
		if (idade > 50) {
			filaPrioritaria.add(nome);
		}
		else if (idade <= 50) {
			filaComum.add(nome);
		}
	}
	
	public static void chamada() {
		if (filaPrioritaria.isEmpty() == false) {
			System.out.println("É a vez de: " + filaPrioritaria.get(0));
			filaPrioritaria.remove(0);
		}
		
		else if(filaComum.isEmpty()){
			System.out.println("Não tem niguém na fila de espera!!");
		}
		
		else {
			System.out.println("É a vez de: " + filaComum.get(0));
			filaComum.remove(0);
		}
	}
}