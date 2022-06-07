package br.com.cesarschool.projetos.telas;
import java.util.Scanner;
import br.com.cesarschool.projetos.entidades.Usuario;
import br.com.cesarschool.projetos.repositorios.RepositorioUsuario;
import br.com.cesarschool.projetos.entidades.Frequencia;
import br.com.cesarschool.projetos.entidades.Demandas;

import java.io.IOException;
import java.time.LocalDate;
import br.com.cesarschool.projetos.entidades.Eventos;

public class TelaUsuario {
		
		private static final String DIGITE_O_ID = "Digite o Id: ";
		private static final String USUARIO_NAO_ENCONTRADO = "Usuario n�o encontrado!";
		private static final int ID_DESCONHECIDO = -1;
		private final Scanner ENTRADA = new Scanner(System.in);
		private RepositorioUsuario repositorioUsuario = RepositorioUsuario.getInstancia();
		private Eventos eventos = Eventos.getInstancia();
		private Demandas demandas = Demandas.getInstancia();
		
		public void executaTela() throws IOException {
			while(true) {
				int id = ID_DESCONHECIDO;
				imprimeMenuPrincipal();
				int opcao = ENTRADA.nextInt();
				
				
				if (opcao == 1) {//Cadastrar Usuario
					processaInclusao();
				} else if (opcao == 2) {//Sobre n�s
					System.out.println("O QUE � O JARDIM SECRETO:\n");
					System.out.println("O Jardim Secreto, coletivo iniciado em 2017, por um grupo de moradores e vizinhos do po�o da panela, foi cria-do na inten��o de dar serventia a um espa�o que at� ent�o estava sendo usado como despejo de lixo. Situado nas margens do rio Capiba-ribe, a iniciativa continua crescendo com o apoio de doa��es e volunt�rios, incentivando a contem-pla��o da natureza e preserva��o ambiental.");
					System.out.println("\nNOSSA HISTORIA\n");
					System.out.println("Desde o dia 27 de maio de 2017, um grupo de moradores e vizinhos de bairros do entorno se uniram para pensar em solu��es colaborativas e ecol�gicas a respeito de um terreno atualmente o Jardim Secreto -, que servia apenas para o despejo de uma grande quantidade de lixo e metralhas, localizado �s margens do rio Capibaribe, no fim da Rua Marques de Tamandar�, no bairro do Po�o da Panela.");
					System.out.print("\n");
					System.out.println("Foram diversas reuni�es que se revezavam na casa de um e de outro, na associa��o dos moradores do bairro, nos �rg�os p�blicos e nas visitas para explora��o e medi��o do terreno at� que grandes transforma��es sociais ocorressem.");
					System.out.print("\n");
				} else if (opcao == 3) {// Perguntas Frequentes
					System.out.println("1 - Onde Se Encontra o Jardim?");
					System.out.println("2 - Horario de Inicio Jardim?");
					System.out.println("3 - Como devo me Vestir?");
					System.out.println("4 - Preciso me inscrever?");
					
					int opPergunta = ENTRADA.nextInt();
					
					switch(opPergunta){
						case 1:
							System.out.println("\nFinal da Rua Marques de Tamandar�, Po�o da Panela\n");
						break;
						
						case 2:
							System.out.println("\nDaremos inicio as x horas, ent�o pedimos que, se poss�vel, comparecer ao local no m�nimo 10 minutos antes do horario marcado\n");
						break;
						
						case 3:
							System.out.println("\nAs atividades s�o ao ar livre e demandam bastante do f�sico de cada volunt�rio. Por isso, recomendamos o uso de roupas leves e cal�ados confortaveis fechados \nExemplos: roupas de academia e t�nis esportivo.\n");
						break;
						
						case 4:
							System.out.println("\nSe voc� j� � um volunt�rio regular no Jardim Secreto, j� realizou seu cadastro e est� inserido em algum dos nossos grupos de whatsapp, n�o h� necessidade de inscri��o. \nNo entanto, se voc� � novo por aqui e deseja fazer parte desse e outros eventos que realizaremos, pedimos que voc� clique aqui para dar inicio ao seu cadastro. A partir disso, a nossa equipe entrar� em contato para que voc� seja inserido em nossa rede de comunica��o\n");
						break;
						
					}
				} else if (opcao == 4) {//Proximos eventos
					eventos.exibirEventos();
				} else if (opcao == 5) {//Demandas
					demandas.exibirDemandas();
				} else if(opcao == 6) {//sair
					break;
				}
			}
		}
		private void imprimeMenuPrincipal() {		
			System.out.println("1- Cadastrar Usuario!");
			System.out.println("2- Sobre n�s");
			System.out.println("3- Perguntas Frequentes");
			System.out.println("4- Eventos");
			System.out.println("5- Demandas");
			System.out.println("6- Sair");
			System.out.print("Digite a op��o: ");
		}
		
//		private void processaMensagensErroValidacao(StatusValidacaoProduto status) {
//			String[] mensagensErro = status.getMensagens();
//			System.out.println("Problemas ao incuir/alterar produto:");
//			for (String mensagemErro : mensagensErro) {
//				if (mensagemErro != null) {
//					System.out.println(mensagemErro);
//				} 
//			}
//		}
		
		private void processaInclusao() {
			Usuario usuario = capturaUsuario(ID_DESCONHECIDO);
			boolean usuarioBool = repositorioUsuario.incluir(usuario);
			if (usuarioBool) { 
				System.out.println("Usuario inclu�do com sucesso!");
			}
		}
		
		
		private int processaBusca() {
			System.out.print(DIGITE_O_ID);
			int id = ENTRADA.nextInt();
			Usuario usuario = repositorioUsuario.buscar(id);
			if (usuario == null) {
				System.out.println(USUARIO_NAO_ENCONTRADO);
				return ID_DESCONHECIDO;
			} else {
				System.out.println("Id: " + usuario.getId());
				System.out.println("Nome: " + usuario.getNome());
				System.out.println("Data Nascimento: " + usuario.getDataNascimento());
				System.out.println("Numero Telefone: " + usuario.getNumeroTelefone());
				System.out.println("Sexo: " + usuario.getSexo());
				System.out.println("Endereco: " + usuario.getEndereco());
				System.out.println("Email: " + usuario.getEmail());
				return id;
			}
		}
		
		private Usuario capturaUsuario(long idParaCadastrar) {
			System.out.print("Digite o nome de usuario: ");
			String nome = ENTRADA.next();
			System.out.print("Digite a sua Data de Nascimento (YYYY-MM-DD): ");
			String dataAux = ENTRADA.next();
			System.out.print("Digite o numero do seu Telefone: ");
			String numeroTelefone = ENTRADA.next();
			System.out.print("Digite o seu Sexo (M ou F): ");
			char sexo = ENTRADA.next().charAt(0);
			System.out.print("Digite o seu Endere�o: ");
			String endereco = ENTRADA.next();
			System.out.print("Digite o seu Email: ");
			String email = ENTRADA.next();
			LocalDate dataNascimento = LocalDate.parse(dataAux);
			return new Usuario(nome, dataNascimento, numeroTelefone, sexo, endereco, email);
		}
	}

