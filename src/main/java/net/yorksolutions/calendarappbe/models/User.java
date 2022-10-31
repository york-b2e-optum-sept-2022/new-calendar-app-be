package net.yorksolutions.calendarappbe.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    public String email;
    public String firstname;
    public String lastname;
    public String password;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

    @OneToMany
    public Set<Event> createdEvents;

    public User(String email) {
        this.email = email;
    }

    public User() {

    }
}
