package com.kaufdev.railtable.order;

import com.kaufdev.railtable.transfer.domain.Section;
import com.kaufdev.railtable.transfer.domain.Station;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "TICKET_SECTION",
            joinColumns = { @JoinColumn(name = "TICKET_ID") },
            inverseJoinColumns = { @JoinColumn(name = "SECTION_ID") }
    )
    private Set<Section> boughtSections = new HashSet<>();

    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal price;

    public Ticket(Set<Section> boughtSections, String firstName, String lastName, String email, BigDecimal price) {
        this.boughtSections = boughtSections;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.price = price;
    }

    public Ticket() {

    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public Set<Section> getBoughtSections() {
        return boughtSections;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}