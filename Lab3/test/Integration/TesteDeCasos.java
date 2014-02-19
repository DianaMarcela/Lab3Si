package Integration;

import java.util.ArrayList;
import java.util.Iterator;


import models.Disciplina;
import models.Fluxograma;
import models.RepositorioDeDisciplinas;
import models.CarregaDisciplinas;

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import static org.junit.Assert.*;

public class TesteDeCasos {

	private Fluxograma fluxograma;
	private Disciplina disciplina1;
	private Disciplina copiaDaDisciplina1;
	private Disciplina disciplina2;
	private Disciplina disciplina_exageradamente_grande;
	private Disciplina disciplina4;
	private ArrayList<Disciplina> listaDeDisciplinasTest = new ArrayList<Disciplina>();;
	
	/* carregando as disciplinas do arquivo */
	@Before
	public void setUp() {
		ArrayList<String> preRequisitos = new ArrayList<String>();
		fluxograma = new Fluxograma();
		disciplina1 = new Disciplina("Calculo I", 4, 1,preRequisitos);
		copiaDaDisciplina1 = new Disciplina("Calculo I", 4, 1, preRequisitos);
		disciplina2 = new Disciplina("Projeto em Computacao II", 6, 8, preRequisitos);
		disciplina_exageradamente_grande = new Disciplina("Disciplina exageradamente grande", 16, 7,preRequisitos);
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
		
		//não pode inserir uma disciplina ficar com mais de 28 creditos apos insercao
		fluxograma.addDisciplina(4, disciplina_exageradamente_grande);
		fluxograma.addDisciplina(4, disciplina1);
		fluxograma.addDisciplina(4, disciplina2);
		
		listaDeDisciplinasTest.add(disciplina_exageradamente_grande);
		listaDeDisciplinasTest.add(disciplina1);
		listaDeDisciplinasTest.add(disciplina2);
		
		for (int i = 0; i < fluxograma.getDisciplinasDoPeriodo(4).size(); i++){
			assertEquals(fluxograma.getDisciplinasDoPeriodo(4).get(i), listaDeDisciplinasTest.get(i));
		}
		
		
		fluxograma.addDisciplina(4, copiaDaDisciplina1);
		
		System.out.println(fluxograma.getCreditosDoPeriodo(4));
		// não adicionou a disciplina pois iria "estourar" o limite de creditos
		for (int i = 0; i < fluxograma.getDisciplinasDoPeriodo(4).size(); i++){
			assertEquals(fluxograma.getDisciplinasDoPeriodo(4).get(i), listaDeDisciplinasTest.get(i));
		}
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
