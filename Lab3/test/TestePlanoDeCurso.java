import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import models.CarregaDisciplinas;
import models.Disciplina;
import models.PlanoDeCurso;
import models.RepositorioDeDisciplinas;

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
		
		RepositorioDeDisciplinas disciplinas = new RepositorioDeDisciplinas();
		
		ArrayList<Disciplina> lista = disciplinas.getTodasAsDisciplinas(); 
		// garantindo primeiro período
		assertEquals("Cálculo_Diferencial_e_Integral_I", lista.get(0).getNomeDisciplina());
		assertEquals("Álgebra_Vetorial_e_Geometria_Analítica", lista.get(1).getNomeDisciplina());
		assertEquals("Leitura_e_Produção_de_Textos",lista.get(2).getNomeDisciplina());
		assertEquals("Programação_I", lista.get(3).getNomeDisciplina());
		assertEquals("Introdução_à_Computação", lista.get(4).getNomeDisciplina());
		assertEquals("Laboratório_de_Programação_I",lista.get(5).getNomeDisciplina());
		assertEquals(4, lista.get(0).getCreditos());
		assertEquals(1, lista.get(0).getPeriodo());
	
	
	}

}
