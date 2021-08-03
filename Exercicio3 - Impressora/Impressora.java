package exercicio3;

public class Impressora{
	private boolean ImpressoraA;
	private int ImpressoraB;
	private String[] ImpressoraC = new String[3];
	private static boolean estaFuncionando = true;
	
	public boolean imprimirA(String texto) {
		this.ImpressoraA = estaFuncionando;
		return this.ImpressoraA;
	}
	
	public int imprimirB(String texto, int numeroInicial, int numeroFinal) {
		int codigo = 0;
		if (numeroFinal == 1) {
			codigo = 1;
		}
		else if (numeroFinal== 2) {
			codigo = 2;
		}
		else if (numeroFinal == 3) {
			codigo = 3;
		}
		else if (numeroFinal== 4) {
			codigo = 4;
		}
		else if (numeroFinal== 5) {
			codigo = 5;
		}
		else if (numeroFinal > 6) {
			codigo = 6;
		}
		this.ImpressoraB = codigo;
		return this.ImpressoraB;
	}	
	
	public String[] imprimirC(String texto1, String texto2, String totalPaginas) {
		this.ImpressoraC[0] = texto1; 
		this.ImpressoraC[1] = texto2;
		this.ImpressoraC[2] = totalPaginas;
		return this.ImpressoraC;
	}	
	
	public String[] getImpressoraC() {
		return ImpressoraC;
	}
}