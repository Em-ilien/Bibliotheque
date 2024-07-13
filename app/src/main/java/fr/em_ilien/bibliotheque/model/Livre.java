package fr.em_ilien.bibliotheque.model;

import java.text.MessageFormat;

public class Livre {
	private String titre;
	private String auteur;
	private String publication;

	public Livre(String titre, String auteur, String publication) {
		this.titre = titre;
		this.auteur = auteur;
		this.publication = publication;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getPublication() {
		return publication;
	}

	public String getTitre() {
		return titre;
	}

	public String toString() {
		return MessageFormat.format("{0}, écrit par {1}, publié en {2}", getTitre(), getAuteur(), getPublication());
	}
}
