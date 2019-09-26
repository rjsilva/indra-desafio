package br.com.indra.model;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class Filme {
	
	
	private String nome;
	
	private String anoLancamento;
	
	
	public Filme(String nome, String anoLancamento) {
		
		this.nome = nome;
		this.anoLancamento = anoLancamento;		

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	

}
