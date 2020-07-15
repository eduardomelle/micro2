package br.com.micro2.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressResource {

	@GetMapping("/address")
	public String getAddress() {
		String teste = null;
		System.err.println(teste.trim());

		return "Rua Gurupá, 401 - Vila Anglo Brasileira - Perdizes";
	}

}
