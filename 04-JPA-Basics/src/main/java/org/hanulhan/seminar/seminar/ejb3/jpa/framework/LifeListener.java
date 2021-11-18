package org.hanulhan.seminar.seminar.ejb3.jpa.framework;

import org.hanulhan.seminar.seminar.ejb3.jpa.entity.SammlungEntity;

import javax.persistence.PostPersist;

public class LifeListener {

    @PostPersist
    public void nachDemSpeichern(SammlungEntity s) {
        System.out.println("Speichere Los...." + s.getId());
    }
}
