
import models.Disciplina;
import models.Fluxograma;
import models.PlanoDeCurso;

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import static org.junit.Assert.*;

public class TesteDeCasos {

	
	@Test
	public void addDisciplinaNoPeriodo(){
		PlanoDeCurso plano = new PlanoDeCurso();
		Fluxograma fluxograma = new Fluxograma();
		Disciplina disciplina = new Disciplina("Calculo 1", 4);
		
		fluxograma.addDisciplina(2, disciplina);
		
		assertEquals(fluxograma.getDisciplinasDoPeriodo(2).get(0).getNomeDisciplina(), "Calculo 1");
		
		
	}
}
