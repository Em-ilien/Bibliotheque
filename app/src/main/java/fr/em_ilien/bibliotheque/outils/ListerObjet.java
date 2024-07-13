package fr.em_ilien.bibliotheque.outils;

public class ListerObjet {
	public static void lister(final Iterable<? extends Object> objects) {
		int i = 0;
		for (final Object object : objects)
			System.out.println(++i + " - " + object);
	}
}
