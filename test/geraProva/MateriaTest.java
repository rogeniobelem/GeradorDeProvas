package geraProva;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MateriaTest {

	List<String> respostasErradas01 = new ArrayList<>();
	List<String> respostasErradas02 = new ArrayList<>();

	private String e1;
	private String e2;
	private String e3;
	private String e4;

	private String f1;
	private String f2;
	private String f3;
	private String f4;

	private String nomeMateria01;
	private String nomeMateria02;

	@Before
	public void inicia() {
		this.e1 = "3";
		this.e2 = "5";
		this.e3 = "125";
		this.e4 = "22";

		this.respostasErradas01.add(e1);
		this.respostasErradas01.add(e2);
		this.respostasErradas01.add(e3);
		this.respostasErradas01.add(e4);

		this.f1 = "4";
		this.f2 = "16";
		this.f3 = "15";
		this.f4 = "42";

		this.respostasErradas02.add(f1);
		this.respostasErradas02.add(f2);
		this.respostasErradas02.add(f3);
		this.respostasErradas02.add(f4);

		this.nomeMateria01 = "Matemática";
		this.nomeMateria02 = "Geografia";
	}

	@Test
	public void deveAdicionarMateria() {
		Materia materia = new Materia(nomeMateria01);
		assertEquals(nomeMateria01, materia.getNomeMateria());
	}

	@Test
	public void deveAlterarONomeDaMateria() {
		Materia materia = new Materia(nomeMateria01);
		assertEquals(nomeMateria01, materia.getNomeMateria());

		materia.alteraNomeMateria(nomeMateria02);
		assertEquals(nomeMateria02, materia.getNomeMateria());
	}

	@Test
	public void deveAdicionarUmAssunto() {
		Questao questao01 = new Questao("Quanto é 2 + 2?", "4", respostasErradas01);
		Questao questao02 = new Questao("Quanto é 4 - 2?", "2", respostasErradas02);

		Assunto assunto = new Assunto("Operações básicas");

		assunto.adicionaQuestao(questao01);
		assunto.adicionaQuestao(questao02);

		Materia materia = new Materia(nomeMateria01);

		materia.adicionaAssunto(assunto);

		assertEquals(1, materia.getAssuntos().size());
		assertEquals("Operações básicas", materia.getAssuntos().get(0).getNomeAssunto());
		assertEquals(2, materia.getAssuntos().get(0).getQuestoes().size());
		assertEquals("Quanto é 2 + 2?", materia.getAssuntos().get(0).getQuestoes().get(0).getPergunta());
	}
}
