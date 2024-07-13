package fr.em_ilien.bibliotheque.menus.principal;

import fr.em_ilien.bibliotheque.Menu;

public class MenuPrincipal extends Menu {
	private static final OptionsMenuPrincipal[] OPTIONS = OptionsMenuPrincipal.values();
	private static final String NOM_MENU = "Menu Principal";

	public MenuPrincipal() {
		super(NOM_MENU, OPTIONS);
	}

}
