package it.polito.tdp.lab04.model;

import java.util.List;

import it.polito.tdp.lab04.DAO.StudenteDAO;

public class TestModel {

	public static void main(String[] args) {
		Model m = new Model();
		/*List<Corso> c = m.addCorsi();
		System.out.println(c.toString());
		List<Studente> s = m.addStudenti();
		System.out.println(s.toString());*/
		StudenteDAO dao= new StudenteDAO();
		Studente st= dao.cercaStudente("158698");
		System.out.println(st.toString());
		
	}

}
