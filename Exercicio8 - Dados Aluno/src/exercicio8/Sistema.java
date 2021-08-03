package exercicio8;

public class Sistema {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Matheus", 222);
		Aluno aluno2 = new Aluno("Eduardo", 333);
		
		aluno1.setNota1(6);
		aluno1.setNota2(8);
		System.out.println("Media Aluno( "+ aluno1.getNome() +" ): " + + aluno1.getMedia());
		
		aluno2.setNota1(5);
		aluno2.setNota2(10);
		System.out.println("Media Aluno( "+ aluno2.getNome() +" ): " + + aluno2.getMedia());
		
		aluno1.getStatusAluno();
		aluno2.getStatusAluno();
	}
}
