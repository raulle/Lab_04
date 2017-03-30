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
		return corsi=dao.getTuttiICorsi();
	}

	public List<Studente> addStudenti(){
		StudenteDAO dao = new StudenteDAO();
		return studenti=dao.getTuttiICorsi();
	}
	
	public Studente cercaNome(String matricola){
		StudenteDAO dao= new StudenteDAO();
		return dao.cercaStudente(matricola);
	}
	
	public List<Studente> getIscrittiCorso(Corso corso){
		CorsoDAO dao = new CorsoDAO();
		return dao.getStudentiIscrittiAlCorso(corso);
	}
	
	public List<Corso> getCorsiIscritto(String matricola){
		StudenteDAO dao = new StudenteDAO();
		return dao.getCorsiIscritto(matricola);
	}
}
