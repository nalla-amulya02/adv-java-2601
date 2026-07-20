package org.example;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {


    @Id
    private int did;
    private String dname;

    @OneToMany
   private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public Department() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }


    public void addTeacher(Teacher t) {
        teachers.add(t);
    }
}
