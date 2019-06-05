package com.gmail.shilovich.stas.jd.repository.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_CARD")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "F_ID", updatable = false, nullable = false)
    private Long id;
    @Column(name = "F_USER_ID")
    private Long userId;
    @Column(name = "F_TITLE")
    private String title;
    @Column(name = "F_FULL_NAME")
    private String name;
    @Column(name = "F_WORKING_TELEPHONE")
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(id, card.id) &&
                Objects.equals(userId, card.userId) &&
                Objects.equals(title, card.title) &&
                Objects.equals(name, card.name) &&
                Objects.equals(phoneNumber, card.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, title, name, phoneNumber);
    }
}
