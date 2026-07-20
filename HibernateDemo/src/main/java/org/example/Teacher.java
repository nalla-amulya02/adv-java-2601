package org.example;


import jakarta.persistence.*;


@Entity
public class Teacher {


    @Id
    private int tid;



    private String tname;


    @ManyToOne
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

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
