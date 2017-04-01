package geraProva;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AssuntoTest {

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
	}

	@Test
	public void deveAdicionarUmAssunto() {
		Assunto assunto = new Assunto("Operações básicas");

		assertEquals("Operações básicas", assunto.getNomeAssunto());
	}

	@Test
	public void deveAdicionarUmaQuestao() {

		Questao questao = new Questao("Quanto é 2 + 2?", "4", respostasErradas01);

		Assunto assunto = new Assunto("Operações básicas");

		assunto.adicionaQuestao(questao);

		List<Questao> questoes = assunto.getQuestoes();

		assertEquals(1, questoes.size());
		assertEquals("Quanto é 2 + 2?", questoes.get(0).getPergunta());
	}

	@Test
	public void deveAdicionarDuasQuestoes() {

		Questao questao01 = new Questao("Quanto é 2 + 2?", "4", respostasErradas01);
		Questao questao02 = new Questao("Quanto é 4 - 2?", "2", respostasErradas02);

		Assunto assunto = new Assunto("Operações básicas");

		assunto.adicionaQuestao(questao01);
		assunto.adicionaQuestao(questao02);

		assunto.exibeQuestoes();

		assertEquals(2, assunto.getQuestoes().size());
		assertEquals("Quanto é 2 + 2?", assunto.getQuestoes().get(0).getPergunta());
		assertEquals("Quanto é 4 - 2?", assunto.getQuestoes().get(1).getPergunta());
	}

	@Test
	public void deveAlerarONomeDoAssunto() {
		Assunto assunto = new Assunto("Operações básicas");

		assertEquals("Operações básicas", assunto.getNomeAssunto());

		assunto.alteraNomeAssunto("Álgebra linear");

		assertEquals("Álgebra linear", assunto.getNomeAssunto());
	}
}
