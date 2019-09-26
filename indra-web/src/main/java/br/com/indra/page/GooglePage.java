package br.com.indra.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.indra.commons.SeleniumRobot;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class GooglePage {

	@FindBy(css = "input[title=Pesquisar]")
	private WebElement inputPesquisa;

	@FindBy(xpath = "//div[@class=\"VlcLAe\"]//input[1]")
	private WebElement buttonPesquisa;

	@FindBy(css = "img[alt=Google]")
	private WebElement imgGoogle;

	@FindBy(id = "resultStats")
	private WebElement resultados;

	public GooglePage(WebDriver webDriver) {

		PageFactory.initElements(webDriver, this);
	}

	/**
	 * pesquisa filmes or diretor no google
	 * @param filmeOrDiretor
	 */
	public void pesquisaFilmeGoogle(String filmeOrDiretor) {

		this.inputPesquisa.clear();
		this.inputPesquisa.sendKeys(filmeOrDiretor);
		SeleniumRobot.implicityWait();
		this.buttonPesquisa.click();

	}

	/**
	 * volta para o campo de pesquisa do google
	 */
	public void voltarGoogle() {
		this.imgGoogle.click();
	}

	/**
	 * retorna o resultado da busca
	 * @return
	 */
	public String getResults() {

		return resultados.getText();
	}

}
