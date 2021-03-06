package org.hanulhan.seminar.seminar.ejb3.slsb1.life;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.hanulhan.seminar.seminar.ejb3.tools.EJBTools;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SLSMitLifeCircleTest {

    private static SLSMitLifeCircle service;

    @BeforeClass
    public static void init() throws NamingException {
        // Kontext erzeugen
		/* ersetzt durch jndi.properties:
		Properties props = new Properties();
		props.put("java.naming.factory.initial",
				"org.jnp.interfaces.NamingContextFactory");
		props.put("java.naming.factory.url.pkgs",
				"org.jboss.naming:org.jnp.interfaces");
		props.put("java.naming.provider.url", "localhost:1099");
		InitialContext context = new InitialContext(props);
		*/
        InitialContext context = new InitialContext();

        //Referenz auf den Stub holen

        String jndiName = EJBTools.machJNDIName(SLSMitLifeCircle.class);
        System.out.println(jndiName);
        service = (SLSMitLifeCircle) context.lookup(jndiName);

    }

    @Test
    public void testePing() {
        String txt = service.ping("den Fisch");
        assertEquals("Danke für: DEN FISCH", txt);

    }

}
