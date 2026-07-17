package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import  org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        create configuration
        Configuration c = new Configuration();
//        reading the hibernate config xml
        c.configure();
//        create a session factory
        SessionFactory sf = c.buildSessionFactory();

//        open a session
        Session s  = sf.openSession();
//started the transaction
        Transaction ts = s.beginTransaction();
        Teacher t1 = new Teacher(1,"john");
        s.persist(t1);
        ts.commit();
        s.close();
        sf.close();

    }
}