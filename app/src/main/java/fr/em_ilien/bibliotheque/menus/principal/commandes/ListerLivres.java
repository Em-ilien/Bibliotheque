package fr.em_ilien.bibliotheque.menus.principal.commandes;

import java.util.List;

import fr.em_ilien.bibliotheque.Commande;
import fr.em_ilien.bibliotheque.model.Bibliotheque;
import fr.em_ilien.bibliotheque.model.Livre;
import fr.em_ilien.bibliotheque.outils.ListerObjet;

public class ListerLivres implements Commande {
	public void executer() {
		System.out.println("Livres dans la bibliothèque :");
		final Bibliotheque bibliotheque = Bibliotheque.instance();

		final List<Livre> livres = bibliotheque.getLivres();
		ListerObjet.lister(livres);
	}

}
