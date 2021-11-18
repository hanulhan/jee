package org.hanulhan.seminar.seminar.ejb3.Hotel;

import org.hanulhan.seminar.seminar.ejb3.hotel.service.HotelService;
import org.hanulhan.seminar.seminar.ejb3.tools.EJBTools;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import static org.junit.Assert.assertEquals;

public class HotelServiceTest {


    private static HotelService service;

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

        String jndiName = EJBTools.machJNDIName(HotelService.class);
        System.out.println(jndiName);
        service = (HotelService) context.lookup(jndiName);

    }

    @Test
    public void testSetGuest() {

    }
}
