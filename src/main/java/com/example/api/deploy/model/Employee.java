package com.example.api.deploy.model;

public class Employee {
  private  String name;
    private  String dep;
    private int id;

    public Employee() {
    }



    public Employee(String name, String dep, int id) {
        this.name = name;
        this.dep = dep;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
