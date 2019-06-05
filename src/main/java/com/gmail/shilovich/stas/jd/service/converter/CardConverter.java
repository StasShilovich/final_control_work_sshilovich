package com.gmail.shilovich.stas.jd.service.converter;

import com.gmail.shilovich.stas.jd.repository.model.Card;
import com.gmail.shilovich.stas.jd.service.model.CardDTO;

public interface CardConverter {
    CardDTO toDTO(Card card);

    Card fromDTO(CardDTO cardDTO);
}
