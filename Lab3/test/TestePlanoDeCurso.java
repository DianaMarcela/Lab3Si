import static org.junit.Assert.*;

import java.util.List;

import models.PlanoDeCurso;

import org.junit.Before;
import org.junit.Test;


public class TestePlanoDeCurso {

	private PlanoDeCurso plano;

	@Before
	public void setUp() throws Exception {
		plano = new PlanoDeCurso();
	}
	

	@Test
	public void deveMostrarDisciplina() {
		List<String> lista = plano.getDisciplinasPeriodo(1);
		
		assertEquals("Calculo I", lista.get(0));
		assertEquals("Algebra Vetorial", lista.get(1));
		assertEquals("Leitura e producao de texto",lista.get(2));
		assertEquals("Programacao I", lista.get(3));
		assertEquals("Introducao a Computacao", lista.get(4));
		assertEquals("Laboratorio de Programacao I",lista.get(5));
		
	
	
	}

}
