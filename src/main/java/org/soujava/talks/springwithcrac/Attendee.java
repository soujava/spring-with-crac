package org.soujava.talks.springwithcrac;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ElementCollection
    @CollectionTable(name = "attendee_technologies", joinColumns = @JoinColumn(name = "attendee_id"))
    @Column(name = "technology")
    private Set<String> technologies = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String> getTechnologies() {
        return technologies;
    }
}
