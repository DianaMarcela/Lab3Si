package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fluxograma {
   private HashMap<Integer,ArrayList<Disciplina>> fluxog;
       
       public Fluxograma(){
               fluxog =  new HashMap<Integer, ArrayList<Disciplina>>();
               for (int i = 1; i < 15; i++ ){
            	   fluxog.put(i, new ArrayList<Disciplina>());
               }
       }

       
    public void addDisciplina(int periodo, Disciplina disciplina){
    	 ArrayList<Disciplina> disciplinasDoPeriodo = this.getDisciplinasDoPeriodo(periodo);
    	 disciplinasDoPeriodo.add(disciplina);
    	 fluxog.put(periodo,disciplinasDoPeriodo);
    	
    }
    
    public ArrayList<Disciplina> getDisciplinasDoPeriodo(int periodo){
		return fluxog.get(periodo);
    	
    }
	
    public HashMap<Integer, ArrayList<Disciplina>> getFluxog() {
		return fluxog;
	}


	public void removeDisciplina(int periodo, Disciplina disciplina) {
		ArrayList<Disciplina> disciplinasDoPeriodo = this.getDisciplinasDoPeriodo(periodo);
   	 	disciplinasDoPeriodo.remove(disciplina);
   	 	fluxog.put(periodo,disciplinasDoPeriodo);
	}


}



