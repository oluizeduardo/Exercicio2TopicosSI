package br.edu.univas.si8.ta.form.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.form.ejb.entities.Client;

@Stateless
public class ClientDAO {
	
	@PersistenceContext(unitName = "cliente")
	private EntityManager em;

	public void insert(Client client) {
		em.persist(client);
	}

	public List<Client> listAll() {
		return em.createQuery("from clientes p", Client.class).getResultList();
	}


}
