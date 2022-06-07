package br.com.cesarschool.projetos.entidades;

public enum PerguntasFrequentes {
	ONDE(1, "Final da Rua Marques de Tamandaré, Poço da Panela"),
	HORAS(2, "Daremos inicio as x horas, então pedimos que, se possível, comparecer ao local no mínimo 10 minutos antes do horario marcado"),
	COMO_IR(3, "As atividades são ao ar livre e demandam bastante do físico de cada voluntário. Por isso, recomendamos o uso de roupas leves e calçados confortaveis fechados\n Exemplos: roupas de academia e tênis esportivo."),
	INSCRICAO(4, "\"Se você já é um voluntário regular no Jardim Secreto, já realizou seu cadastro\"\r\n"
				+ "			+ \"e está inserido em algum dos nossos grupos de whatsapp, não há necessidade de inscrição.\"\r\n"
				+ "			+ \"No entanto, se você é novo por aqui e deseja fazer parte desse e outros eventos que realizaremos,\"\r\n"
				+ "			+ \"pedimos que você clique aqui para dar inicio ao seu cadastro. A partir disso, a nossa equipe entrará em\"\r\n"
				+ "			+ \"contato para que você seja inserido em nossa rede de comunicação\";");
	
	private int codigo;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	private PerguntasFrequentes(int codigo) {
		this.codigo = codigo;
	}
	
}
