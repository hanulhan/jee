package org.hanulhan.seminar.seminar.ejb3.slsb4.aop;

import org.hanulhan.seminar.seminar.ejb3.tools.EJBTools;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import static org.junit.Assert.assertEquals;

public class TimeMeasureTester {

	private static DelayService service;

	@BeforeClass
	public static void init() throws NamingException {
		InitialContext ctx = new InitialContext();
		service = (DelayService) ctx.lookup(EJBTools.machJNDIName(DelayService.class));

	}

	@Test
	public void testeMeasure() {
		service.Delay(1000);
	}

}
