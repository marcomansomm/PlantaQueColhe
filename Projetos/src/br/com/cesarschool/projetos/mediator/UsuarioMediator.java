package br.com.cesarschool.projetos.mediator;

import br.com.cesarschool.projetos.repositorios.RepositorioUsuario;

public class UsuarioMediator {

	//private RepositorioUsuario repositorioUsuario = RepositorioUsuario.getInstancia();

	private static final String MENSAGEM_NOME_COM_DIGITOS_INVALIDOS = "Nome inv�lido!";
	private static final String MENSAGEM_NOME_NAO_STRING = "Nome informado n�o � um texto!";
	private static final String MENSAGEM_ = "Pre�o inv�lido!";
	private static final String MENSAGEM_NOME_NAO_INFORMADO = "Nome n�o informado!";	
	private static final String MENSAGEM_NOME_MUITO_CURTO = "Nome muito curto!";
	private static final String MENSAGEM_TIPO_NAO_PREENCHIDO = "Tipo n�o preenchido!";
	private static final String MENSAGEM_PRODUTO_JA_CADASTRADO = "Produto j� cadastrado!";
	private static final String MENSAGEM_PRODUTO_NAO_ENCONTRADO = "Produto n�o encontrado!";
	private static final int TAMANHO_MINIMO_NOME = 3;
	
}
