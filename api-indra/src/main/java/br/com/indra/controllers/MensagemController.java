package br.com.indra.controllers;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.EncoderConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import br.com.indra.config.EndPoint;
import br.com.indra.service.Http;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class MensagemController extends Http<Response> {

	/**
	 * lista mensagem
	 */
	@Override
	public Response getMapping() {

		
		try {
			Response response = RestAssured
					.given()
					.config(RestAssured.config()
				    .encoderConfig(EncoderConfig.encoderConfig()
					.encodeContentTypeAs("aplication/json",ContentType.JSON)))
					.when()
					.baseUri(EndPoint.BASE_URL).get();

			return response;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
}
