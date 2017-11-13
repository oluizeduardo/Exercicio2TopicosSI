package br.edu.univas.si8.ta.form.ejb.interfaces;

public interface Client {

	void createNewClient(String clientName, String clientEmail);

	String[] listClientNames();
}
