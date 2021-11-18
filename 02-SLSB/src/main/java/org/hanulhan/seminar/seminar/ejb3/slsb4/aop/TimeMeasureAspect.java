package org.hanulhan.seminar.seminar.ejb3.slsb4.aop;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.Date;

public class TimeMeasureAspect {
    @AroundInvoke
    public Object measure(InvocationContext ctx) throws Exception {
        long now= new Date().getTime();
        // Die eigentliche Ausführung
        Object o = ctx.proceed();

        long runtime= new Date().getTime() - now;
        System.out.println("Laufzeit von " + ctx.getMethod() + ": " + runtime);

        return o;
    }
}
