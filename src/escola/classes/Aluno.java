package escola.classes;

public class Aluno {
	
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String numeroCPF;
	private String matricula;
	private String estado;
	private String cidade;
	
	private int idade;
	private double nota1;
	private double nota2;
	private double nota3;
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	/**
	 * NOTAS DO TIPO DOUBLE 
	 * 
	 */
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	/**
	 * MEDIA DA SOMA DAS NOTAS
	 * @return
	 */
	
	public double getMediaNota() {
		int divide = 3;
		return ((nota1 + nota2 + nota3) / divide);
	}

	public boolean aprovado() { // VERIFICA SE MEDIA EH MAIOR QUE 6 (SEIS)
		if (this.getMediaNota() >= 6) {
			return true;
		} else {
			return false;
		}
	}

}
