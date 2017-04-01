/**
 * @author Rogênio Lima Belém
 * Criado em 2017-03-31
 * 
 * Informa os requisitos da questão a ser utilizada no programa
 * 
 */
package geraProva;

import java.util.ArrayList;
import java.util.List;

public class Questao {
	private String pergunta;
	private String respostaCerta;
	private List<String> respostasErradas = new ArrayList<>();

	public Questao(String pergunta, String respostaCerta, List<String> respostasErradas) {
		this.pergunta = pergunta;
		this.respostaCerta = respostaCerta;
		this.respostasErradas = respostasErradas;
	}

	public String getPergunta() {
		return pergunta;
	}

	public String getRespostaCerta() {
		return respostaCerta;
	}

	public List<String> getRespostasErradas() {
		return respostasErradas;
	}

	/**
	 * Altera a resposta correta quando ela precisa ser corrigida
	 * 
	 * @param novaResposta
	 *            String com a resposta corrigida, que substituirá a resposta
	 *            antiga a ser alterada
	 */
	public void corrigeRespostaCerta(String novaResposta) {
		this.respostaCerta = novaResposta;
	}

	@Override
	public String toString() {
		return "Pergunta: " + this.pergunta + "\nResposta Certa: " + this.respostaCerta + "\nRespostas Erradas: "
				+ this.respostasErradas;
	}

}
