package br.com.cesarschool.projetos.entidades;

public enum Frequencia {
	MUITO_FREQUENTE(1, "Muito Frequente"), 
	FREQUENTE(2, "Frequente"), 
	POUCO_FREQUENTE(3,"Pouco Frequente");
	
	private int codigo;
	private String descricao;

	private Frequencia(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
}
