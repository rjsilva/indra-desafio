package br.com.indra.steps;

import static org.junit.Assert.assertEquals;

import br.com.indra.controllers.MensagemController;
import br.com.indra.dto.MensagemDTO;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class MensagemSteps {

	private MensagemController mensagemController;
	private com.jayway.restassured.response.Response response;
	private MensagemDTO mensagem;

	public MensagemSteps() {

		this.mensagemController = new MensagemController();
		this.mensagem = new MensagemDTO();

	}

	@Dado("^que faco uma requisicao GET/todos$")
	public void queFacoUmaRequisicaoGETTodos() throws Throwable {

		this.mensagemController.getMapping().getBody();
		response = mensagemController.getMapping();
	}

	@Entao("^o titulo da mensagem \"([^\"]*)\"$")
	public void oTituloDaMensagem(String msg) throws Throwable {

		MensagemDTO mesagem = response.body().as(MensagemDTO.class);
		assertEquals(mesagem.getTitle(),msg);

	}

	@Entao("^devo receber um status code '(\\d+)'$")
	public void devoReceberUmStatusCode(int code) throws Throwable {

		assertEquals(code, response.statusCode());
		System.out.println(response.statusCode());
	}
}
