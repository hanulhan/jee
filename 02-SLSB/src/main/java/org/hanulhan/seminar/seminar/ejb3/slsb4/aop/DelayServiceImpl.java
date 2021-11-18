package org.hanulhan.seminar.seminar.ejb3.slsb4.aop;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless(name = "DelayService", mappedName = "ejb/DelayService")
public class DelayServiceImpl implements DelayService {
    @Override
    @Interceptors({ TimeMeasureAspect.class })
    public void Delay(long msec) {
        for (int i=0; i<msec; i++);

    }
}
