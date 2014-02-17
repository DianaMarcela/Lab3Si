
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

	private PlanoDeCurso plano;
	private Fluxograma fluxograma;
	private Disciplina disciplina1;
	private Disciplina copiaDaDisciplina1;
	private Disciplina disciplina2;
	
	@Before
	public void setUp() {
		fluxograma = new Fluxograma();
		disciplina1 = new Disciplina("Calculo I", 4);
		copiaDaDisciplina1 = new Disciplina("Calculo I", 4);
		disciplina2 = new Disciplina("Projeto em Computacao II", 6);
	}
	
	@Test
	public void testaAdicaoDeDisciplina(){
		
		//inserindo disciplina no segundo periodo
		fluxograma.addDisciplina(2, disciplina1);
		// verificando se a disciplina foi inserida como se esperava
		assertTrue(fluxograma.getDisciplinasDoPeriodo(2).contains(disciplina1));
		//verifica se a disciplina ja esta contida no periodo...
		/*usa-se objetos diferentes mas que representam a mesma disciplina 
		pra se ter certeza que a disciplina é reconhecida de acordo com seus atributos*/
		assertTrue(fluxograma.getDisciplinasDoPeriodo(2).contains(copiaDaDisciplina1));
		
		//inserindo disciplina no oitavo periodo
		fluxograma.addDisciplina(8, disciplina2);
		// verificando se a disciplina foi inserida como se esperava
		assertTrue(fluxograma.getDisciplinasDoPeriodo(8).contains(disciplina2));
	}
	
	
	@Test
	public void testaRemocaoDeDisciplina(){
		//adicionando duas disciplina no terceiro periodo
		fluxograma.addDisciplina(3, disciplina1);
		fluxograma.addDisciplina(3, disciplina2);
		
		//verifica se o periodo contem Calculo I
		assertTrue(fluxograma.getDisciplinasDoPeriodo(3).contains(disciplina1));
		//remove Calculo I
		fluxograma.removeDisciplina(3, disciplina1);
		//verifica se o periodo nao mais contem Calculo I
		assertFalse((fluxograma.getDisciplinasDoPeriodo(3).contains(disciplina1)));
	}
}
