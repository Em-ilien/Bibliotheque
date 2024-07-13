package fr.em_ilien.bibliotheque;

import java.util.List;

import fr.em_ilien.bibliotheque.outils.ListerObjet;
import fr.em_ilien.bibliotheque.outils.MenuOptionExecution;
import fr.em_ilien.bibliotheque.outils.OutilScanneur;

public abstract class Menu {
	private String nom;
	private OptionsMenu[] options;

	public Menu(final String nom, final OptionsMenu[] options) {
		super();
		this.nom = nom;
		this.options = options;
	}

	public void afficherMenu() {
		System.out.println(this.nom);

		ListerObjet.lister(List.of(this.options));

		final int choix = OutilScanneur.scanEntier("Choix :");
		MenuOptionExecution.executer(options, choix);

		System.out.println("\n===");
		afficherMenu();
	}

}