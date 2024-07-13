package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;

@FunctionalInterface
public interface Action {
    SessionFactory factory = Util.getSessionFactory();
    void handle();
}