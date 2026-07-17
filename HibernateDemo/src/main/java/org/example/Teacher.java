package org.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {


    @Id
    private int tid;

    private String tname;

    public Teacher(int tid,String tname) {
        this.tname = tname;
        this.tid = tid;
    }

    public Teacher() {
    }

    public int getTid() {
        return tid;
    }
    public void setTid(int tid) {
        this.tid = tid;
    }
    public String getTname() {
        return tname;
    }
    public void setTname(String tname) {
        this.tname = tname;
    }
}
