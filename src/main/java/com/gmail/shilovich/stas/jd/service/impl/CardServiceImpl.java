package com.gmail.shilovich.stas.jd.service.impl;

import com.gmail.shilovich.stas.jd.repository.CardRepository;
import com.gmail.shilovich.stas.jd.repository.model.Card;
import com.gmail.shilovich.stas.jd.service.CardService;
import com.gmail.shilovich.stas.jd.service.converter.CardConverter;
import com.gmail.shilovich.stas.jd.service.model.CardDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements CardService {

    private static final Logger logger = LogManager.getLogger(CardServiceImpl.class);

    private final CardRepository cardRepository;
    private final CardConverter cardConverter;

    public CardServiceImpl(CardRepository cardRepository, CardConverter cardConverter) {
        this.cardRepository = cardRepository;
        this.cardConverter = cardConverter;
    }

    @Override
    @Transactional
    public List<CardDTO> getDTOCards() {
        List<Card> cardsAPI = cardRepository.getCardsAPI();
        List<CardDTO> cardDTOS = cardsAPI.stream()
                .map(cardConverter::toDTO)
                .collect(Collectors.toList());
        return cardDTOS;
    }
}
