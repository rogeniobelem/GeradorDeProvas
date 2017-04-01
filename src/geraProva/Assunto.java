/**
 * @author Rogênio Lima Belém
 * Classe que anuncia o assunto que separará as questões
 */
package geraProva;

import java.util.List;

public class Assunto {

	private String nomeAssunto;
	private List<Questao> questoes;

	public Assunto(String nomeAssunto) {
		this.nomeAssunto = nomeAssunto;
	}

	public String getNomeAssunto() {
		return nomeAssunto;
	}

	public void alteraNomeAssunto(String novoNomeAssunto) {
		this.nomeAssunto = novoNomeAssunto;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void adicionaQuestao(Questao questao) {
		this.questoes.add(questao);
	}

}
