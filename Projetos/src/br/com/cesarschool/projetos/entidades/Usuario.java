package br.com.cesarschool.projetos.entidades;
import java.time.LocalDate;


public class Usuario {
	private int id;
	private String nome;
	private LocalDate dataNascimento;
	private String numeroTelefone;
	private char sexo;
	//private String ocupacao;
	private String endereco;
	private String email;
	
	
	public Usuario(String nome, LocalDate dataNascimento, String numeroTelefone, char sexo, String endereco, String email){
		this.setId(); 
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setNumeroTelefone(numeroTelefone);
		this.setSexo(sexo);
		this.setEndereco(endereco);
		this.setEmail(email);
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumeroTelefone() {
		return numeroTelefone;
	}


	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}


	public int getId() {
		return id;
	}


	public void setId() {
		this.id += 1;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


//	public String getOcupacao() {
//		return ocupacao;
//	}


//	public void setOcupacao(String ocupacao) {
//		this.ocupacao = ocupacao;
//	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
