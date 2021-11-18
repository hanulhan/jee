package org.hanulhan.seminar.seminar.ejb3.slsb4.aop;

import javax.ejb.Remote;

@Remote
public interface DelayService {

    public void Delay(long msec);
}
