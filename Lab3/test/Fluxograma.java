
import java.util.ArrayList;
import java.util.HashMap;



public class Fluxograma {
   private HashMap<Integer,ArrayList<Disciplina>> fluxog;
       
       public Fluxograma(){
               fluxog =  new HashMap<Integer, ArrayList<Disciplina>>();
               ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
               
               Disciplina calculoI = new Disciplina("Calculo I", 4);
               Disciplina vetorial = new Disciplina("Algebra Vetorial", 4);
               Disciplina lpt = new Disciplina("Leitura e producao de texto", 4);
               Disciplina p1 = new Disciplina("Programacao I", 4);
               Disciplina ic = new Disciplina("Introducao a Computacao", 4);
               Disciplina lp1 = new Disciplina("Laboratorio de Programacao I", 4);
               
               listaDisciplinas.add(calculoI);
               listaDisciplinas.add(vetorial);
               listaDisciplinas.add(lpt);
               listaDisciplinas.add(p1);
               listaDisciplinas.add(ic);
               listaDisciplinas.add(lp1);
               
               fluxog.put(1, listaDisciplinas);
                          
               
       }

	public HashMap<Integer, ArrayList<Disciplina>> getFluxog() {
		return fluxog;
	}

	
       

}



