package fr.em_ilien.bibliotheque.menus.principal.commandes;

import fr.em_ilien.bibliotheque.Commande;
import fr.em_ilien.bibliotheque.model.Bibliotheque;
import fr.em_ilien.bibliotheque.model.Livre;
import fr.em_ilien.bibliotheque.outils.OutilScanneur;

public class AjouterLivre implements Commande {
	public void executer() {
		final String titre = OutilScanneur.scanChaine("Entrez le titre du livre :");
		final String auteur = OutilScanneur.scanChaine("Entrez l'auteur du livre :");
		final String publication = OutilScanneur.scanChaine("Entrez l'année de publication :");

		Bibliotheque.instance().ajouterLivre(new Livre(titre, auteur, publication));
	}
}
