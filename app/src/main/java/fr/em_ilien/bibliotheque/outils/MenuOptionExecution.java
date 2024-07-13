package fr.em_ilien.bibliotheque.outils;

import java.lang.reflect.InvocationTargetException;

import fr.em_ilien.bibliotheque.OptionsMenu;

public class MenuOptionExecution {

	public static void executer(final OptionsMenu[] options, final int choix) {
		if (choix > options.length)
			throw new IllegalArgumentException();
	
		try {
			options[choix - 1].getClasse().getDeclaredConstructor().newInstance().executer();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
