package exercicio8;

public class Aluno {
	private int nroMatricula;
	private String nome;
	private String email;
	private double nota1;
	private double nota2;
	private double media;
	
	public Aluno(String nome, int nroMatricula) {
		this.nome = nome;
		this.nroMatricula = nroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNota1(double nota1) throws IllegalArgumentException {
		if (nota1 > 10) {
			throw new IllegalArgumentException("As notas devem ser menores que 10!!");
		} 
		else if (nota1 < 0) {
			throw new IllegalArgumentException("As notas não podem ser menores que 0");
		} 
		else this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		if (nota2 > 10) {
			throw new IllegalArgumentException("As notas devem ser menores que 10!!");
		} 
		else if (nota2 < 0) {
			throw new IllegalArgumentException("As notas não podem ser menores que 0");
		} 
		else this.nota2 = nota2;
		
		double soma = this.nota1 + this.nota2;
		this.media = soma/2;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void getStatusAluno() {
		System.out.println("Status Aluno - "+ this.nome + " -" + " Numero: " + this.nroMatricula);
		System.out.println("Nota1 Aluno( "+ this.nome +" ): " + + this.nota1);
		System.out.println("Nota2 Aluno( "+ this.nome +" ): " + + this.nota2);
		System.out.println("Media Aluno( "+ this.nome +" ): " + + this.media);
	}
	
}
