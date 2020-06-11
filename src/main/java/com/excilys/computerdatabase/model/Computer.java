package com.excilys.computerdatabase.model;

import java.util.Objects;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Computer {

    @Id
    private String uuid = UUID.randomUUID().toString();

    private String name;

    @ManyToOne
    private Company company;

    public String getUuid() {
        return uuid;
    }

    public Computer setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        this.name = name;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Computer setCompany(Company company) {
        this.company = company;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer computer = (Computer) o;
        return Objects.equals(uuid, computer.uuid) &&
            Objects.equals(name, computer.name) &&
            Objects.equals(company, computer.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, company);
    }

    @Override
    public String toString() {
        return "Computer{" +
            "uuid='" + uuid + '\'' +
            ", name='" + name + '\'' +
            ", company=" + company +
            '}';
    }
}
