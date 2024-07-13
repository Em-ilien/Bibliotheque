package fr.em_ilien.bibliotheque.menus.principal.commandes;

import java.util.List;

import fr.em_ilien.bibliotheque.Commande;
import fr.em_ilien.bibliotheque.model.Bibliotheque;
import fr.em_ilien.bibliotheque.model.Livre;
import fr.em_ilien.bibliotheque.outils.ListerObjet;
import fr.em_ilien.bibliotheque.outils.OutilScanneur;

public class RechercherLivres implements Commande {
	public void executer() {
		final String titre = OutilScanneur.scanChaine("Entrez le titre à rechercher :");

		System.out.println("Résultats de la recherche :");
		
		final Bibliotheque bibliotheque = Bibliotheque.instance();
		final List<Livre> livres = bibliotheque.rechercherParTitre(titre);
		ListerObjet.lister(livres);
	}
}
