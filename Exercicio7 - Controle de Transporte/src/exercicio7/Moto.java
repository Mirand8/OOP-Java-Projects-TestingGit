package exercicio7;

public class Moto extends Transporte{
	private double capacidadeDeCarga;
	
	public Moto(String tipoTransporte, int qtEstimadaDias, double capacidadeDeCarga) {
		super(tipoTransporte, qtEstimadaDias);
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}
	
	public void printRelatorio() {
		System.out.println("--RELATORIO: --");
		System.out.println("TRANSPORTE: " + this.tipoTransporte);
		System.out.println("CARGA: " + this.capacidadeDeCarga + "kg");
		System.out.println("TEMPO ESTIMADO: " + this.qtEstimadaDias + " dias");
	}
}
