package com.gmail.shilovich.stas.jd.repository.impl;

import com.gmail.shilovich.stas.jd.repository.CardRepository;
import com.gmail.shilovich.stas.jd.repository.model.Card;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class CardRepositoryImpl extends GenericRepositoryImpl<Long, Card> implements CardRepository {
    @Override
    public List<Card> getCardsAPI() {
        String hql = "FROM Card ";
        Query query = entityManager.createQuery(hql);
        return query.getResultList();
    }

    @Override
    public void deleteCardById(Long id) {

    }

    @Override
    public Card addCardAPI(Card card) {
        return null;
    }
}
