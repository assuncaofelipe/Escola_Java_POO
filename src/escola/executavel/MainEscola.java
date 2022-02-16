package escola.executavel;

import escola.classes.Aluno;

public class MainEscola {

	public static void main(String[] args) {
		
		/**
		 *-----------------------------------
		 */
		
		Aluno aluno1 = new Aluno(); // ALUNO PEPE
		aluno1.setIdade(24);
		aluno1.setNome("Pepe");
		aluno1.setSobrenome("Assuncao");
		aluno1.setDataNascimento("09/01/1998");
		aluno1.setMatricula("2121");
		aluno1.setEstado("AM");
		aluno1.setCidade("Ita");
		aluno1.setNota1(5);
		aluno1.setNota2(5);
		aluno1.setNota3(5);
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Matricula: " + aluno1.getMatricula());
		System.out.println("Media: " + aluno1.getMediaNota());
		System.out.println("Aprovado: " + aluno1.aprovado());
		
		/**
		 *-----------------------------------
		 */
		
		Aluno aluno2 = new Aluno(); // ALUNO FELIPE
		aluno2.setIdade(24);
		aluno2.setNome("Felipe");
		aluno2.setSobrenome("Assuncao");
		aluno2.setDataNascimento("10/01/1998");
		aluno2.setMatricula("2222");
		aluno2.setEstado("AM");
		aluno2.setCidade("Ita");
		aluno2.setNota1(10);
		aluno2.setNota2(10);
		aluno2.setNota3(10);
		
		System.out.println();
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Matricula: " + aluno2.getMatricula());
		System.out.println("Media: " + aluno2.getMediaNota());
		System.out.println("Aprovado: " + aluno2.aprovado());
		
	}
}
