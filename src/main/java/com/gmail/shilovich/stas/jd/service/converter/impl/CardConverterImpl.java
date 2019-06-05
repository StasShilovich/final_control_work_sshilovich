package com.gmail.shilovich.stas.jd.service.converter.impl;

import com.gmail.shilovich.stas.jd.repository.model.Card;
import com.gmail.shilovich.stas.jd.service.converter.CardConverter;
import com.gmail.shilovich.stas.jd.service.model.CardDTO;
import org.springframework.stereotype.Component;

@Component
public class CardConverterImpl implements CardConverter {
    @Override
    public CardDTO toDTO(Card card) {
        CardDTO cardDTO = new CardDTO();
        cardDTO.setTitle(card.getTitle());
        cardDTO.setName(card.getName());
        cardDTO.setPhone(card.getPhoneNumber());
        return cardDTO;
    }

    @Override
    public Card fromDTO(CardDTO cardDTO) {
        Card card = new Card();
        card.setTitle(cardDTO.getTitle());
        card.setName(cardDTO.getName());
        card.setPhoneNumber(cardDTO.getPhone());
        return card;
    }
}
