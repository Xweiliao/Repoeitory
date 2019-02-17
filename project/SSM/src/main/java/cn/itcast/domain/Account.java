package cn.itcast.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private Integer id;
    private String name;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoeny() {
        return money;
    }

    public void setMoeny(Double moeny) {
        this.money = moeny;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", moeny=" + money +
                '}';
    }
}
