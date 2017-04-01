package geraProva;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class QuestaoTest {

	@Test
	public void deveCriarUmaQuestao() {

		List<String> respostasErradas = new ArrayList<>();
		String e1 = "3";
		String e2 = "5";
		String e3 = "125";
		String e4 = "22";

		respostasErradas.add(e1);
		respostasErradas.add(e2);
		respostasErradas.add(e3);
		respostasErradas.add(e4);
		Questao questao = new Questao("Quanto é 2 + 2?", "4", respostasErradas);

		assertEquals("Quanto é 2 + 2?", questao.getPergunta());
		assertEquals("4", questao.getRespostaCerta());
		assertEquals("3", questao.getRespostasErradas().get(0));
		assertEquals("5", questao.getRespostasErradas().get(1));
		assertEquals("125", questao.getRespostasErradas().get(2));
		assertEquals("22", questao.getRespostasErradas().get(3));

	}

	@Test
	public void deveCorrigirRespostaCerta() {

		List<String> respostasErradas = new ArrayList<>();
		String e1 = "3";
		String e2 = "5";
		String e3 = "125";
		String e4 = "22";

		respostasErradas.add(e1);
		respostasErradas.add(e2);
		respostasErradas.add(e3);
		respostasErradas.add(e4);
		Questao questao = new Questao("Quanto é 2 + 2?", "22", respostasErradas);

		assertEquals("22", questao.getRespostaCerta());

		questao.corrigeRespostaCerta("4");

		assertEquals("4", questao.getRespostaCerta());

	}

}
