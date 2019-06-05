package com.gmail.shilovich.stas.jd.repository;

import com.gmail.shilovich.stas.jd.repository.model.Card;

import java.util.List;

public interface CardRepository extends GenericRepository<Long, Card> {
    List<Card> getCardsAPI();

    void deleteCardById(Long id);

    Card addCardAPI(Card card);

}
