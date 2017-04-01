package geraProva;

import java.util.ArrayList;
import java.util.List;

public class Materia {

	private String nomeMateria;
	private List<Assunto> assuntos = new ArrayList<>();

	public Materia(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	/**
	 * Retorna o nome da matéria
	 * 
	 * @return Retorna o nome da matéria
	 */
	public String getNomeMateria() {
		return this.nomeMateria;
	}

	/**
	 * Altera o nome da matéria, seja para corrigí-lo, seja para algo mais
	 * entendível
	 * 
	 * @param novoNomeMateria
	 *            String com o novo nome para qual o nome da matéria deve ser
	 *            alterado
	 */
	public void alteraNomeMateria(String novoNomeMateria) {
		this.nomeMateria = novoNomeMateria;
	}

	/**
	 * Retorna a lista dos assuntos salvos
	 * 
	 * @return Retorna a lista dos assuntos salvos
	 */
	public List<Assunto> getAssuntos() {
		return this.assuntos;
	}

	/**
	 * Exibe os assuntos salvos na matéria
	 */
	public void exibeAssuntos() {
		this.assuntos.forEach(cadaAssunto -> {
			System.out.println(cadaAssunto + "\n");
		});
	}

	/**
	 * Adiciona o assunto <code>novoAssunto</code> à lista de assuntos
	 * 
	 * @param novoAssunto
	 *            Objeto do tipo Questao que será inserido à lista
	 */
	public void adicionaAssunto(Assunto novoAssunto) {
		this.assuntos.add(novoAssunto);
	}

	@Override
	public String toString() {
		return this.getNomeMateria();
	}

}
