package fr.em_ilien.bibliotheque.outils;

import java.util.Scanner;

public class OutilScanneur {
	private static final Scanner SCANNEUR = new Scanner(System.in);
	public static String scanChaine(final String message) {
		System.out.println(message);
		return SCANNEUR.nextLine();
	}

	public static Integer scanEntier(final String message) {
		final String choix = scanChaine(message);
		try {
			return Integer.valueOf(choix);
		} catch (NumberFormatException e) {
			throw e;
		}
	}
}
