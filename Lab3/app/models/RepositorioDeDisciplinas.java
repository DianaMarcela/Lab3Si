package models;

import java.awt.List;
import java.util.ArrayList;

public class RepositorioDeDisciplinas {

	private ArrayList<Disciplina> todasAsDisciplinas = new ArrayList<Disciplina>();
		
	public RepositorioDeDisciplinas() {
		CarregaDisciplinas gatilho = new CarregaDisciplinas();
		for(Disciplina disciplina: gatilho.getTodasAsDisciplinas()){
			todasAsDisciplinas.add(disciplina);
		}
	}

	public ArrayList<Disciplina> getTodasAsDisciplinas() {
		return todasAsDisciplinas;
	}

	public void setTodasAsDisciplinas(ArrayList<Disciplina> todasAsDisciplinas) {
		this.todasAsDisciplinas = todasAsDisciplinas;
	}

	@Override
	public String toString() {
		return "RepositorioDeDisciplinas [todasAsDisciplinas="
				+ todasAsDisciplinas + "]";
	}
	
	
	
	
	

	
}
