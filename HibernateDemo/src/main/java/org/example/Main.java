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

        // ----------------------

        // create
        // Teacher t1 = new Teacher(3,"Mary");
        // s.persist(t1);


        // read
        // Teacher t2 = null;
        // t2 = s.find(Teacher.class, 1);
        // System.out.println(t2.getTid() + " " + t2.getTname());

        // update
        // Teacher t3 = null;
        // t3 = s.find(Teacher.class, 3);
        // t3.setTname("Tom");

        //delete
        // s.remove(t3);
// --------------------------------
  Department d1 = new Department(1,"CSE");

  Teacher t1 = new Teacher(4,"John"); 
  Teacher t2 = new Teacher(5,"Mary"); 

  t1.setDepartment(d1);
  t2.setDepartment(d1);


  d1.addTeacher(t1);
  d1.addTeacher(t2);

  s.persist(d1);
  s.persist(t1);
  s.persist(t2);



        ts.commit();
        s.close();
        sf.close();

    }
}