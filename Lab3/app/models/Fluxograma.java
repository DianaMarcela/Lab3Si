package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Fluxograma 
 *
 */
public class Fluxograma {
	private HashMap<Integer, ArrayList<Disciplina>> fluxog;

	/**
	 * Construtor
	 */
	public Fluxograma() {
		fluxog = new HashMap<Integer, ArrayList<Disciplina>>();
		for (int i = 1; i < 15; i++) {
			fluxog.put(i, new ArrayList<Disciplina>());
		}
	}

	/**
	 * Adiciona a disciplina no perido
	 * @param periodo
	 * @param disciplina
	 */
	public void addDisciplina(int periodo, Disciplina disciplina) {
		if((getCreditosDoPeriodo(periodo) + disciplina.getCreditos()) < 29 ){
			ArrayList<Disciplina> disciplinasDoPeriodo = this.getDisciplinasDoPeriodo(periodo);
			disciplinasDoPeriodo.add(disciplina);
			fluxog.put(periodo, disciplinasDoPeriodo);
		}
	}

	public int getCreditosDoPeriodo(int periodo) {
		int cont = 0;
		for (Disciplina disciplina : fluxog.get(periodo)){
			cont += disciplina.getCreditos();
		}
		return cont;
	}

	/**
	 * Obter as disciplinas de um periodo especifico
	 * @param periodo
	 * @return Um array de disciplinas
	 */
	public ArrayList<Disciplina> getDisciplinasDoPeriodo(int periodo) {
		return fluxog.get(periodo);

	}

	/**
	 * Obter o Fluxograma
	 * @return o mapa do fluxograma
	 */
	public HashMap<Integer, ArrayList<Disciplina>> getFluxog() {
		return fluxog;
	}

	/**
	 * Remove a disciplina do periodo especificado.
	 * @param periodo
	 * @param disciplina
	 */
	public void removeDisciplina(int periodo, Disciplina disciplina) {
		ArrayList<Disciplina> disciplinasDoPeriodo = this.getDisciplinasDoPeriodo(periodo);
		disciplinasDoPeriodo.remove(disciplina);
		fluxog.put(periodo, disciplinasDoPeriodo);
	}

}
