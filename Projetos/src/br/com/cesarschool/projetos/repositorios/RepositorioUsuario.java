package br.com.cesarschool.projetos.repositorios;

import br.com.cesarschool.projetos.entidades.Usuario;


public class RepositorioUsuario {

	private static final int TAMANHO_MAX_USUARIOS = 10000;
	private static RepositorioUsuario instancia = null;
	
	private Usuario[] cadastroUsuario = new Usuario[TAMANHO_MAX_USUARIOS];
	private int tamanhoAtual = 0;

	public static RepositorioUsuario getInstancia() {
		if (instancia == null) {
			instancia = new RepositorioUsuario();
		}
		return instancia; 
	}
	
	public boolean incluir(Usuario usuario) {
		if (buscarIndice(usuario.getId()) != -1) {
			return false;
		} else if (tamanhoAtual == TAMANHO_MAX_USUARIOS - 1) {
			return false;
		} else {
			for (int i = 0; i < cadastroUsuario.length; i++) {
				if (cadastroUsuario[i] == null) {
					cadastroUsuario[i] = usuario; 
					break;
				}
			}
			tamanhoAtual++; 
			return true; 
		}
	}
	public boolean alterar(Usuario usuario) {
		int indice = buscarIndice(usuario.getId()); 
		if (indice == -1) {
			return false;
		} else {
			cadastroUsuario[indice] = usuario;
			return true; 
		}
	}
	
	public Usuario buscar(int id) {
		int indice = buscarIndice(id);
		if (indice == -1) {
			return null;
		} else {
			return cadastroUsuario[indice];
		}
	}
	
	public boolean excluir(int id) {
		int indice = buscarIndice(id);
		if (indice == -1) {
			return false;
		} else {
			cadastroUsuario[indice] = null;
			tamanhoAtual--;
			return true;
		}		
	}
	
	private int buscarIndice(int id) {		
		for (int i = 0; i < cadastroUsuario.length; i++) {
			Usuario usuario = cadastroUsuario[i];
			if (usuario != null && usuario.getId() == id) {
				return i; 				
			}
		}
		return -1;
	}
}

