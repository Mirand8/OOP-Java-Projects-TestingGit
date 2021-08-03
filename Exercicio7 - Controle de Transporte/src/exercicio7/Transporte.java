package exercicio7;

public class Transporte {
	protected String tipoTransporte;
	protected int qtEstimadaDias;
	
	public Transporte(String tipoTransporte, int qtEstimadaDias) {
		this.tipoTransporte = tipoTransporte;
		this.qtEstimadaDias = qtEstimadaDias;
	}
	
	public String getTipoTransporte() {
		return tipoTransporte;
	}
	
	public int getQtEstimadaDias() {
		return qtEstimadaDias;
	}
	
	
	
}
