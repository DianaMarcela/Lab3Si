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
	
	
	
	
	
	
	

}
