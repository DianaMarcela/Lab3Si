package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class CarregaDisciplinas {

	private String arquivo = "app/models/disciplinas.txt";
	private List<Disciplina> todasAsDisciplinas;

	public CarregaDisciplinas() {
		todasAsDisciplinas = new ArrayList<Disciplina>();
		carregar();
	}

	public List<Disciplina> carregar() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File(arquivo))));

			while (in.ready()) {
				String[] linhas = in.readLine().split("-");
				String nome = linhas[0];
				int creditos = Integer.parseInt(linhas[1]);
				int periodo = Integer.parseInt(linhas[2]);
				ArrayList<String> preRequisitos = carregarPreRequisitosDoArquivo(linhas[3]);
				todasAsDisciplinas.add(new Disciplina(nome, creditos, periodo,
						preRequisitos));

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return todasAsDisciplinas;

	}

	private ArrayList<String> carregarPreRequisitosDoArquivo(String linha) {
		ArrayList<String> preRequisitos = new ArrayList<String>();
		linha = linha.replace("}", "");
		linha = linha.replace("{", "");

		String[] nomePreRequisitos = linha.split(",");

		for (String nome : nomePreRequisitos) {
			if (!nome.equals("")) {
				preRequisitos.add(nome);
			}
		}
		return preRequisitos;
	}

	public List<Disciplina> getTodasAsDisciplinas() {
		return todasAsDisciplinas;
	}

	public void setTodasAsDisciplinas(List<Disciplina> todasAsDisciplinas) {
		this.todasAsDisciplinas = todasAsDisciplinas;
	}

}
