package br.com.cesarschool.projetos.entidades;

public enum PerguntasFrequentes {
	ONDE(1, "Final da Rua Marques de Tamandar�, Po�o da Panela"),
	HORAS(2, "Daremos inicio as x horas, ent�o pedimos que, se poss�vel, comparecer ao local no m�nimo 10 minutos antes do horario marcado"),
	COMO_IR(3, "As atividades s�o ao ar livre e demandam bastante do f�sico de cada volunt�rio. Por isso, recomendamos o uso de roupas leves e cal�ados confortaveis fechados\n Exemplos: roupas de academia e t�nis esportivo."),
	INSCRICAO(4, "\"Se voc� j� � um volunt�rio regular no Jardim Secreto, j� realizou seu cadastro\"\r\n"
				+ "			+ \"e est� inserido em algum dos nossos grupos de whatsapp, n�o h� necessidade de inscri��o.\"\r\n"
				+ "			+ \"No entanto, se voc� � novo por aqui e deseja fazer parte desse e outros eventos que realizaremos,\"\r\n"
				+ "			+ \"pedimos que voc� clique aqui para dar inicio ao seu cadastro. A partir disso, a nossa equipe entrar� em\"\r\n"
				+ "			+ \"contato para que voc� seja inserido em nossa rede de comunica��o\";");
	
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
