package br.com.indra;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.indra.commons.SeleniumRobot;
import br.com.indra.commons.Urls;
import br.com.indra.page.GooglePage;
import br.com.indra.utils.DataBaseFilmes;
import br.com.indra.utils.DriverInitializer;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class GoogleSearch {

	private DataBaseFilmes dataBaseFilmes;
	private GooglePage google;

	
	 static WebDriver webDriver;

	    @BeforeClass
	    public static void setUp() throws Exception {
	        webDriver = DriverInitializer.getDriver();
	    }

	    @Before
	    public void navigate() {
	    	webDriver.manage().window().fullscreen();
	    	webDriver.get(Urls.GOOGLE_URL);
	    }
	    
	    @AfterClass
	    public static void tearDown() {
	        webDriver.quit();
	    }
	    
	 @Test
	 public void execute() {
		 
		 validarFilme();
		 validarPesquisaDiretor();
	 }

	 
	/**
	 * pesquisa filmes
	 */
	public void validarFilme() {

		GooglePage google = new GooglePage(webDriver);

		this.dataBaseFilmes.getAllFilmes().forEach( f -> {
			google.pesquisaFilmeGoogle(f.getNome());
	        System.out.println("Nome do Filme" + f.getNome() + " - Resultado da pesquisa: " + google.getResults());
			google.voltarGoogle();
		});
		
	}
	
	/**
	 * pesquisa diretores
	 */
	public void validarPesquisaDiretor() {

		GooglePage google = new GooglePage(webDriver);

		this.dataBaseFilmes.getAllDiretores().forEach( d -> {
			google.pesquisaFilmeGoogle(d.getNome());
	        System.out.println("Nome do Diretor" + d.getNome() + " - Resultado da pesquisa: " + google.getResults());
			google.voltarGoogle();
		});
		
	}

}
