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
               
               Disciplina calculoI = new Disciplina("Calculo I", 4);
               Disciplina vetorial = new Disciplina("Algebra Vetorial", 4);
               Disciplina lpt = new Disciplina("Leitura e producao de texto", 4);
               Disciplina p1 = new Disciplina("Programacao I", 4);
               Disciplina ic = new Disciplina("Introducao a Computacao", 4);
               Disciplina lp1 = new Disciplina("Laboratorio de Programacao I", 4);
               
               ArrayList<Disciplina> lista1periodo = fluxog.get(1);
               lista1periodo.add(calculoI);
               lista1periodo.add(vetorial);
               lista1periodo.add(lpt);
               lista1periodo.add(p1);
               lista1periodo.add(ic);
               lista1periodo.add(lp1);
               
               fluxog.put(1, lista1periodo);
                          
               
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



