package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {

	public List<Studente> getTuttiICorsi() {

		final String sql = "SELECT * FROM studente";

		List<Studente> studenti = new LinkedList<Studente>();

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				Studente s = new Studente(rs.getString("matricola"),rs.getString("cognome"),rs.getString("nome"),rs.getString("CDS"));// Crea un nuovo JAVA Bean Corso
				studenti.add(s);// Aggiungi il nuovo Corso alla lista
			}

			return studenti;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}
	
	public Studente cercaStudente(String matricola){
		final String sql = "SELECT matricola,cognome,nome,CDS " +
					"FROM studente "+
					"WHERE matricola=?";
		Studente result=null;

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, matricola);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {

				Studente s = new Studente(rs.getString("matricola"),rs.getString("cognome"),rs.getString("nome"),rs.getString("CDS"));// Crea un nuovo JAVA Bean Corso
				result=s;
			}

			return result;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}
}
