package models;

import java.awt.List;
import java.util.ArrayList;

/**
 * Classe RepositorioDeDisciplinas
 *
 */
public class RepositorioDeDisciplinas {

	private ArrayList<Disciplina> todasAsDisciplinas = new ArrayList<Disciplina>();
	
	/**
	 * Construtor
	 */
	public RepositorioDeDisciplinas() {
		CarregaDisciplinas gatilho = new CarregaDisciplinas();
		for(Disciplina disciplina: gatilho.getTodasAsDisciplinas()){
			todasAsDisciplinas.add(disciplina);
		}
	}
	
	
	/**
	 * Array que possui as disciplinas
	 * @return as disciplinas
	 */
	public ArrayList<Disciplina> getTodasAsDisciplinas() {
		return todasAsDisciplinas;
	}
	
	/**
	 * Modifica o array que possui as Disciplina
	 * @param todasAsDisciplinas
	 */
	public void setTodasAsDisciplinas(ArrayList<Disciplina> todasAsDisciplinas) {
		this.todasAsDisciplinas = todasAsDisciplinas;
	}

	@Override
	public String toString() {
		return "RepositorioDeDisciplinas [todasAsDisciplinas="
				+ todasAsDisciplinas + "]";
	}
	
	
	
	
	

	
}
