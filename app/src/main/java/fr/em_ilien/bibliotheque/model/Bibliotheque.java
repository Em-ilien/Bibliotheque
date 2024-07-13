package fr.em_ilien.bibliotheque.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Bibliotheque {

	private static Bibliotheque INSTANCE;

	private List<Livre> livres;

	private Bibliotheque() {
		this.livres = new ArrayList<Livre>();
	}

	public static Bibliotheque instance() {
		if (INSTANCE == null)
			INSTANCE = new Bibliotheque();
		return INSTANCE;
	}

	public void ajouterLivre(final Livre livre) {
		livres.add(livre);
	}
	
	public List<Livre> getLivres() {
		return new ArrayList<Livre>(this.livres);
	}

	public List<Livre> rechercherParTitre(final String titre) {
		return this.livres.stream().filter(livre -> livre.getTitre().contains(titre)).collect(Collectors.toList());
	}
}
