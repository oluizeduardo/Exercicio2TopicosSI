package br.edu.univas.si8.ta.form.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.form.ejb.interfaces.Client;
import br.edu.univas.si8.ta.form.rest.api.ClientService;

@RequestScoped
public class ClientServiceImpl implements ClientService {

	@EJB(mappedName = "java:app/form-rest-ejb-0.1-SNAPSHOT/ClientBean!br.edu.univas.si8.ta.form.ejb.interfaces.ClientRemote")
	private Client client;

	@Override
	public String[] listClientNames() {
		return client.listClientNames();
	}

	@Override
	public String saveNewClient(String name, String email) {
		client.createNewClient(name, email);
		return "{\"message\": \"Success\"}";
	}

}
