package fr.em_ilien.bibliotheque.menus.principal;

import fr.em_ilien.bibliotheque.Commande;
import fr.em_ilien.bibliotheque.OptionsMenu;
import fr.em_ilien.bibliotheque.menus.principal.commandes.AjouterLivre;
import fr.em_ilien.bibliotheque.menus.principal.commandes.ListerLivres;
import fr.em_ilien.bibliotheque.menus.principal.commandes.Quitter;
import fr.em_ilien.bibliotheque.menus.principal.commandes.RechercherLivres;

public enum OptionsMenuPrincipal implements OptionsMenu {
	AJOUTER_LIVRE("Ajouter un livre", AjouterLivre.class),

	LISTER_LIVRES("Lister tous les livres", ListerLivres.class),

	RECHERCHER_LIVRE("Rechercher un livre par titre", RechercherLivres.class),

	QUITTER("Quitter", Quitter.class),

	;

	private String label;
	private Class<? extends Commande> classe;

	private OptionsMenuPrincipal(final String label, final Class<? extends Commande> classe) {
		this.label = label;
		this.classe = classe;
	}

	public String getLabel() {
		return label;
	}

	public Class<? extends Commande> getClasse() {
		return classe;
	}
	
	public String toString() {
		return getLabel();
	}
}
