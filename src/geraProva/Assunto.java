/**
 * @author Rogênio Lima Belém
 * Criado em 2017-04-01
 * 
 * Classe que anuncia o assunto que separará as questões
 * 
 */
package geraProva;

import java.util.ArrayList;
import java.util.List;

public class Assunto {

	private String nomeAssunto;
	private List<Questao> questoes = new ArrayList<>();

	public Assunto(String nomeAssunto) {
		this.nomeAssunto = nomeAssunto;
	}

	/**
	 * Retorna o nome do assunto
	 * 
	 * @return Retorna o nome do assunto
	 */
	public String getNomeAssunto() {
		return this.nomeAssunto;
	}

	/**
	 * Altera o nome do assunto, seja para corrigí-lo, seja para algo mais
	 * entendível
	 * 
	 * @param novoNomeAssunto
	 *            String com o novo nome para qual o nome do assunto deve ser
	 *            alterado
	 */
	public void alteraNomeAssunto(String novoNomeAssunto) {
		this.nomeAssunto = novoNomeAssunto;
	}

	/**
	 * Retorna a lista das questões salvas
	 * 
	 * @return Retorna a lista das questões salvas
	 */
	public List<Questao> getQuestoes() {
		return this.questoes;
	}

	/**
	 * Exibe as questões salvas no assunto
	 */
	public void exibeQuestoes() {
		this.questoes.forEach(cadaQuestao -> {
			System.out.println(cadaQuestao + "\n");
		});
	}

	/**
	 * Adiciona a questão 'novaQuestao' à lista de questões
	 * 
	 * @param novaQuestao
	 *            Objeto do tipo Questao que será inserido à lista
	 */
	public void adicionaQuestao(Questao novaQuestao) {
		this.questoes.add(novaQuestao);
	}

	@Override
	public String toString() {
		return this.getNomeAssunto();
	}
}
