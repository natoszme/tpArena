package httpClient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import httpClientService.HttpClient;

public class TestHttpClient {
	
	@Before
	public void before() {
		HttpClient.getInstance().setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
	}
	
	@Test
	public void alBuscarUnClienteSeObiteneUnaRespuestaConPrimerNombre() {
		String jsonResponse = HttpClient.getInstance().dameEstudiante();
		Assert.assertTrue(jsonResponse.contains("first_name"));
	}
	
	@Test
	public void elJsonDevueltoContieneNombre() {
		String jsonResponse = HttpClient.getInstance().dameEstudiante();
		Assert.assertTrue(jsonResponse.contains("first_name"));
	}
	
	@Test
	public void elJsonDevuelveLasAsignaciones() {
		String jsonResponse = HttpClient.getInstance().dameAsignaciones();
		Assert.assertTrue(jsonResponse.contains("assignments"));
	}
}