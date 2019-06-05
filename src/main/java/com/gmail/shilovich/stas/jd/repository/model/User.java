package com.gmail.shilovich.stas.jd.repository.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "F_ID", updatable = false, nullable = false)
    private Long id;
    @Column(name = "F_NAME")
    private String name;
    @Column(name = "F_PASSWORD")
    private String password;
    @Column(name = "F_ROLE")
    private Role role;
    @OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="F_USER_ID")
    private List<Card> cards = new ArrayList<>();

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                role == user.role &&
                Objects.equals(cards, user.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, role, cards);
    }
}
