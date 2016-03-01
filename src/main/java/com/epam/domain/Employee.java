package com.epam.domain;

/**
 * <p/>
 * Copyright (C) 2014 copyright.com
 * <p/>
 * Date: 3/1/2016
 *
 * @author Stanislau Kavalski
 */
public class Employee {

    private int salary;
    private String name;
    private String position;
    private int id;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setId(int id) {
        this.id = id;
    }
}
