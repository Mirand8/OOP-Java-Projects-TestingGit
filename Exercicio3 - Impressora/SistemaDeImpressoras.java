package exercicio3;

public class SistemaDeImpressoras {
	public static void main(String[] args) {
		Impressora impressora = new Impressora();
		
		String texto1 = "Este é texto usado para exemplo";
		String texto2 = "Este é o segundo texto usado para exemplo";
		//ImpressoraA
		System.out.println("IMPRESSORA A");
		if (impressora.imprimirA(texto1) == true) {
			System.out.println("Status Impressora A: true");
			System.out.println(texto1);
		}
		else System.out.println("Status Impressora B: false");
		//ImpressoraB
		System.out.println("Código de resultado ImpressoraB = " 
		+ impressora.imprimirB(texto1, 1, 2)); 
		//ImpressoraC
		System.out.println("IMPRESSORA C");
		impressora.imprimirC(texto1, texto2 , "5");
		
		for (String itens : impressora.getImpressoraC()) {
			System.out.print(itens + ";");
		}
		
	}
}