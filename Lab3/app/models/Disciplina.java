package models;

import java.util.ArrayList;
import java.util.List;

	/**
	 * Classe Disciplina
	 * 
	 *OBS: Information Expert= possui o conhecimento total de uma disciplina.
	 */

public class Disciplina {

	private String nomeDisciplina;
	private int creditos;
	private int periodo;
	private ArrayList<String> preRequisito;

	
	/**
	 * Construtor de disciplina
	 * @param nomeDisciplina
	 * @param credito
	 * @param periodo
	 * @param preRequesito
	 */
	public Disciplina(String nomeDisciplina, int credito, int periodo,
			ArrayList<String> preRequesito) {
		this.nomeDisciplina = nomeDisciplina;
		this.creditos = credito;
		this.periodo = periodo;
		this.preRequisito = preRequesito;
	}
	/**
	 * Retorna o nome da disciplina
	 * @return nome da disciplina
	 */
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}	
	
	/**
	 * Modifica nome disciplina
	 * @param nomeDisciplina
	 */
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	 * Quantidade de creditos
	 * @return creditos
	 */
	public int getCreditos() {
		return creditos;
	}
	/**
	 * Periodo da disciplina
	 * @return periodo
	 */
	public int getPeriodo() {
		return periodo;
	}
	
	/**
	 * Lista de preRequesitos de um disciplina
	 * @return a lista de preRequisitos
	 */
	public List<String> getPreRequisito() {
		return preRequisito;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creditos;
		result = prime * result
				+ ((nomeDisciplina == null) ? 0 : nomeDisciplina.hashCode());
		result = prime * result
				+ ((preRequisito == null) ? 0 : preRequisito.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (creditos != other.creditos)
			return false;
		if (nomeDisciplina == null) {
			if (other.nomeDisciplina != null)
				return false;
		} else if (!nomeDisciplina.equals(other.nomeDisciplina))
			return false;
		if (preRequisito == null) {
			if (other.preRequisito != null)
				return false;
		} else if (!preRequisito.equals(other.preRequisito))
			return false;
		return true;
	}

}
