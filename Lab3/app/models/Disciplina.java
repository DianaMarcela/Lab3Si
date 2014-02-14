package models;
import java.util.ArrayList;
import java.util.List;


public class Disciplina {
	
	
	private String nomeDisciplina;
	private int credito;
	private List<Disciplina> preRequisito;
	
	public Disciplina(String nomeDisciplina, int credito, List<Disciplina> preRequesito){
		this.nomeDisciplina = nomeDisciplina;
		this.credito = credito;
		this.preRequisito = new ArrayList<Disciplina>();
		
	}
	public Disciplina(String nomeDisciplina, int credito){
		this.nomeDisciplina = nomeDisciplina;
		this.credito = credito;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	public List<Disciplina> getPreRequisito() {
		return preRequisito;
	}
	public void setPreRequisito(List<Disciplina> preRequisito) {
		this.preRequisito = preRequisito;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + credito;
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
		if (credito != other.credito)
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
