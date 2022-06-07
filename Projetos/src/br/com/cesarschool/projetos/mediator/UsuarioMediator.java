package br.com.cesarschool.projetos.mediator;

import br.com.cesarschool.projetos.repositorios.RepositorioUsuario;

public class UsuarioMediator {

	//private RepositorioUsuario repositorioUsuario = RepositorioUsuario.getInstancia();

	private static final String MENSAGEM_NOME_COM_DIGITOS_INVALIDOS = "Nome inválido!";
	private static final String MENSAGEM_NOME_NAO_STRING = "Nome informado não é um texto!";
	private static final String MENSAGEM_ = "Preço inválido!";
	private static final String MENSAGEM_NOME_NAO_INFORMADO = "Nome não informado!";	
	private static final String MENSAGEM_NOME_MUITO_CURTO = "Nome muito curto!";
	private static final String MENSAGEM_TIPO_NAO_PREENCHIDO = "Tipo não preenchido!";
	private static final String MENSAGEM_PRODUTO_JA_CADASTRADO = "Produto já cadastrado!";
	private static final String MENSAGEM_PRODUTO_NAO_ENCONTRADO = "Produto não encontrado!";
	private static final int TAMANHO_MINIMO_NOME = 3;
	
}
