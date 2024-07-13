package fr.em_ilien.bibliotheque.menus.principal.commandes;

import fr.em_ilien.bibliotheque.Commande;

public class Quitter implements Commande {
	private static final int SUCCESS_EXIT_CODE = 0;

	public void executer() {
		System.out.println("Au revoir !");
		System.exit(SUCCESS_EXIT_CODE);
	}
}
