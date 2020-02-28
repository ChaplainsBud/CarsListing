package com.example.carslisting;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    // used, new, truck, motorcycle...
    // the one has only one value, and this name... leads us to many vehicles

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL,
    // mappedBy = "category" ... is this a variable from Car?

    fetch = FetchType.EAGER)
    public Set<Car> cars;

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

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    // This relationship is mapped by "category," what does cascade mean?
    // Eager takes objects and their relationships, everything.
    // This abstract set of car objects is aptly called cars.
}
