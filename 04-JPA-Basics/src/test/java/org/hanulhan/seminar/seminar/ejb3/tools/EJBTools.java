package org.hanulhan.seminar.seminar.ejb3.tools;

public class EJBTools {
	private static final String APP_NAME = ""; // Name EAR-File
	private static final String MODUL_NAME = "04-jpa-basics"; // Name Jar-File

	@SuppressWarnings("rawtypes")
	public static String machJNDIName(Class klasse) {
		String beanName = klasse.getSimpleName();
		// String beanName = KommunikationsTestImpl.class.getSimpleName();
		String viewClassName = klasse.getName();
		String jndiName= "ejb:/" + APP_NAME + MODUL_NAME + "/" + beanName + "!" + viewClassName;
		System.out.println("jndi-Name: " + jndiName);
		return jndiName;
	}

}
