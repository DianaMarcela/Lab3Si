package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

/**
 * Classe CarregaDisciplina responsavel por ler o arquivo.
 *
 *OBS: Information Expert = possui as informacoes necessarias para obtencao das disciplinas.
 */
public class CarregaDisciplinas {

	private String arquivo = "app/models/disciplinas.txt";
	private List<Disciplina> todasAsDisciplinas;	

	/**
	 * Construtor
	 */
	public CarregaDisciplinas() {
		todasAsDisciplinas = new ArrayList<Disciplina>();
		carregar();
	}
	
	/**
	 * Carrega a lista das disciplinas
	 * @return a lista com todas as disciplinas
	 */
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

	/**
	 * Carrega os preRequisito das disciplinas
	 * @param linha
	 * @return os preRequisitos
	 */
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

	/**
	 * Lista com as disciplinas
	 * @return a lista de todasAsDisciplinas
	 */
	public List<Disciplina> getTodasAsDisciplinas() {
		return todasAsDisciplinas;
	}

	/**
	 * Modifica a lista das disciplinas
	 * @param todasAsDisciplinas
	 */
	public void setTodasAsDisciplinas(List<Disciplina> todasAsDisciplinas) {
		this.todasAsDisciplinas = todasAsDisciplinas;
	}

}
