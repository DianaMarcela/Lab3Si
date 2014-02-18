package models;
import java.util.ArrayList;
import java.util.List;


public class Disciplina {
	
	
	private String nomeDisciplina;
	private int creditos;
	private int periodo;
	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	private ArrayList<String> preRequisito;
	
	public Disciplina(String nomeDisciplina, int credito, int periodo, ArrayList<String> preRequesito){
		this.nomeDisciplina = nomeDisciplina;
		this.creditos = credito;
		this.periodo = periodo;
		this.preRequisito = preRequesito;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCredito(int credito) {
		this.creditos = credito;
	}

	
	
	
	public List<String> getPreRequisito() {
		return preRequisito;
	}

	public void setPreRequisito(ArrayList<String> preRequisito) {
		this.preRequisito = preRequisito;
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
