package fr.em_ilien.bibliotheque;

public interface OptionsMenu {
	public String getLabel();

	public Class<? extends Commande> getClasse();
}
