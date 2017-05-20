package com.dh.project.demo.domain;

/**
 * Created by Cristhian on 19/05/2017.
 * POJO
 */
public class Teacher {
    private long id;
    private String name;

    public Teacher(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
