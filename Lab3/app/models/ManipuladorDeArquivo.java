package models;

import java.io.*;

public class ManipuladorDeArquivo {
	public static void main (String[]args) throws IOException{
	try {
		BufferedReader arquivo = new BufferedReader(new FileReader("disciplinas.txt"));
		
		while(arquivo.ready()){
			String linha = arquivo.readLine();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}

