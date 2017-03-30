package it.polito.tdp.lab04.model;

public class Corso {
	
	private String codIns;
	private String crediti;
	private String nome;
	private String pd;
	
	public Corso(String codIns, String crediti, String nome, String pd) {
		super();
		this.codIns = codIns;
		this.crediti = crediti;
		this.nome = nome;
		this.pd = pd;
	}

	public String getCodIns() {
		return codIns;
	}

	public void setCodIns(String codIns) {
		this.codIns = codIns;
	}

	public String getCrediti() {
		return crediti;
	}

	public void setCrediti(String crediti) {
		this.crediti = crediti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPd() {
		return pd;
	}

	public void setPd(String pd) {
		this.pd = pd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codIns == null) ? 0 : codIns.hashCode());
		result = prime * result + ((crediti == null) ? 0 : crediti.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pd == null) ? 0 : pd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		if (codIns == null) {
			if (other.codIns != null)
				return false;
		} else if (!codIns.equals(other.codIns))
			return false;
		if (crediti != other.crediti)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pd != other.pd)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return codIns+"    "+ crediti + "    " + nome + "    " + pd + "\n";
	}


}
