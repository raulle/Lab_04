package it.polito.tdp.lab04.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {
	
	private List<Corso> corsi;
	private List<Studente> studenti;
	
	public Model(){
		this.corsi= new LinkedList<Corso>();
		this.studenti= new LinkedList<Studente>();

	}
	
	public List<Corso> addCorsi(){
		CorsoDAO dao = new CorsoDAO();
		corsi=dao.getTuttiICorsi();
		return corsi;
	}

	public List<Studente> addStudenti(){
		StudenteDAO dao = new StudenteDAO();
		studenti=dao.getTuttiICorsi();
		return studenti;
	}
	
	public Studente cercaNome(String matricola){
		StudenteDAO dao= new StudenteDAO();
		return dao.cercaStudente(matricola);
	}
}
