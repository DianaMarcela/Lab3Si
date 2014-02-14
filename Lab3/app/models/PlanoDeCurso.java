package models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PlanoDeCurso {
	private Disciplina disciplina;
	private Fluxograma fluxog = new Fluxograma();
	private HashMap<Integer, ArrayList<Disciplina>> disc;
	
	

	public Disciplina getDisciplina() {
		return disciplina;	
	}
	
	public List<String> getDisciplinasPeriodo(Integer periodo){
		List<String> testando =  new ArrayList<String>();
		disc = fluxog.getFluxog();
		
		for(int i= 0; i < disc.get(periodo).size(); i++){
			testando.add(disc.get(periodo).get(i).getNomeDisciplina());
		}
		
		return testando;
			
		}
		
	}

