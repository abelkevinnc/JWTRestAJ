package com.demo;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.demo.security.services.TokenService;

public class TokenTest {

	@Test
	public void testCrearToken() throws ParseException {
		
		TokenService servicio = new TokenService();
		DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
		String token = servicio.creaToken("cecilio", "superclave", formateador.parse("10/09/2019"));
				
		System.out.println(token);
		//salida :
		//eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWNpbGlvIiwiZXhwIjoxNTY4MDkxNjAwfQ.7ZnaQ0Cegv3rCN7G2VgH2_B2c5pqWZQviDyQE4QybRI
		assertEquals(token, "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWNpbGlvIiwiZXhwIjoxNTY4MDkxNjAwfQ.7ZnaQ0Cegv3rCN7G2VgH2_B2c5pqWZQviDyQE4QybRI");
		
	}
	
	@Test
	public void testLeerTokenUsuario() {
		TokenService servicio = new TokenService();
		String usuario = servicio.leeToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWNpbGlvIiwiZXhwIjoxNTY4MDkxNjAwfQ.7ZnaQ0Cegv3rCN7G2VgH2_B2c5pqWZQviDyQE4QybRI", "superclave");
		assertEquals("cecilio", usuario);
	}
	
	

}
