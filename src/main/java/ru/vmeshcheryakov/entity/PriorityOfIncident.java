package ru.vmeshcheryakov.entity;

import javax.persistence.*;

@Entity
public class PriorityOfIncident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Возможно сделать через enum
    @Column(name = "name")
    String name;

    public PriorityOfIncident() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PriorityOfIncident{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
