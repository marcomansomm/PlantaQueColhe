package br.com.cesarschool.projetos.entidades;

import java.io.*;
import java.util.StringTokenizer;


public class Eventos {
	
	private static Eventos instancia = null;
	
	public static Eventos getInstancia() {
		if (instancia == null) {
			instancia = new Eventos();
		}
		return instancia; 
	}
	
	public void exibirEventos() throws IOException {
		System.out.println("---------------- EVENTOS ----------------");
		
		FileInputStream stream = new FileInputStream("C:\\Users\\João\\Downloads\\eventos.txt"); //colocar o path do arquivo
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		
		while(linha != null) {
			 StringTokenizer st = new StringTokenizer(linha);
			 while(st.hasMoreTokens()) {
				 String tok = st.nextToken("|");
				 System.out.println(tok);	 
			}
			 linha = br.readLine();
			 System.out.println();
		}
		br.close();
	}
	
	
}
