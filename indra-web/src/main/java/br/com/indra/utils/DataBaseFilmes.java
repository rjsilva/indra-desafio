package br.com.indra.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.indra.model.Diretor;
import br.com.indra.model.Filme;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class DataBaseFilmes {

	private static List<Filme> filmes = new ArrayList<>();
	private static List<Diretor> diretores = new ArrayList<>();

	/**
	 * adiciona os filmes na lista
	 * @return
	 */
	public static List<Filme> getAllFilmes() {

		filmes.add(new Filme("the beach filme", "04/08/2000"));
		filmes.add(new Filme("seven pounds movie", "04/08/2008"));
		filmes.add(new Filme("suicide squad movie", "16/08/2016"));
		filmes.add(new Filme("the pianist movie", "04/08/2003"));

		return filmes;
	}

	/**
	 * adiciona os diretores dos filmes na lista
	 * @return
	 */
	public static List<Diretor> getAllDiretores() {

		diretores.add(new Diretor("Danny Boyle", "06/08/1956"));
		diretores.add(new Diretor("Gabriele Muccino", "20/05/2008"));
		diretores.add(new Diretor("James Cameron", "06/08/1970"));
		diretores.add(new Diretor("David Ayer", "18/01/1968"));

		return diretores;
	}

}
