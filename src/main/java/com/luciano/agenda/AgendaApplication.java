package com.luciano.agenda;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luciano.agenda.entities.Cliente;
import com.luciano.agenda.repositories.ClienteRepository;

@SpringBootApplication
public class AgendaApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente c1 = new Cliente(null, "Celia cristina", "99991234", "12/02/2022");
		Cliente c2 = new Cliente(null, "Heloisa", "88881234", "11/05/2022");

		clienteRepository.saveAll(Arrays.asList(c1, c2));

	}

}
