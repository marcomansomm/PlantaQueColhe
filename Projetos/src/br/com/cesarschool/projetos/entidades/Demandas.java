package br.com.cesarschool.projetos.entidades;

import java.io.*;
import java.util.StringTokenizer;

public class Demandas {
	private static Demandas instancia = null;
	
	public static Demandas getInstancia() {
		if (instancia == null) {
			instancia = new Demandas();
		}
		return instancia; 
	}
	
	public void exibirDemandas() throws IOException {
		System.out.println("---------------- DEMANDAS ----------------");
		
		FileInputStream stream = new FileInputStream("C:\\Users\\João\\Downloads\\demandas.txt"); //colocar o path do arquivo
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
