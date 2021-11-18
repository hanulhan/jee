package org.hanulhan.seminar.seminar.ejb3.beziehungen.test;

/**
 * Zurücksetzen:
	delete from benutzer_rollen ;
	delete from benutzer ;
	delete from gruppe ;
	delete from kontaktdaten ;
	delete from rolle ;
 */
import java.util.List;

import javax.naming.InitialContext;

import org.hanulhan.seminar.seminar.ejb3.beziehungen.service.BenutzerService;
import org.hanulhan.seminar.seminar.framework.EJBTools;
import org.hanulhan.seminar.seminar.ejb3.beziehungen.Benutzer;

public class GeburtstagsTest {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		InitialContext ctx = new InitialContext();
		BenutzerService service = (BenutzerService) ctx.lookup(EJBTools.machJNDIName(BenutzerService.class));
		List<Benutzer> liste = service.getGeburtstagsListe();
		System.out.println(liste.size());
		for (Benutzer benutzer : liste) {
			System.out.println(benutzer.getName() + ": " + benutzer.getKontaktdaten().getGeburtstag());
		}
	}

}
