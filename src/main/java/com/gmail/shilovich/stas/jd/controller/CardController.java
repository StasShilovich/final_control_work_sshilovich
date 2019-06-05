package com.gmail.shilovich.stas.jd.controller;

import com.gmail.shilovich.stas.jd.service.CardService;
import com.gmail.shilovich.stas.jd.service.model.CardDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/private")
public class CardController {
    private static final Logger logger = LoggerFactory.getLogger(CardController.class);

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }


    @GetMapping("/cards")
    public List<CardDTO> getItems()  {
        List<CardDTO> cardDTOS = cardService.getDTOCards();
        cardDTOS.stream()
                .forEach(cardDTO -> logger.info(cardDTO.getName()));
        return cardDTOS;
    }
}
