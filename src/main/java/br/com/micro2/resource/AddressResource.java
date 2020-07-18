package br.com.micro2.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressResource {

	private static final Logger LOG = LoggerFactory.getLogger(AddressResource.class);

	@GetMapping("/address")
	public String getAddress() {
		LOG.info("ADDRESS");
		LOG.warn("ADDRESS");
		LOG.error("ADDRESS");

		return "Rua Gurupá, 401 - Vila Anglo Brasileira - Perdizes";
	}

}
