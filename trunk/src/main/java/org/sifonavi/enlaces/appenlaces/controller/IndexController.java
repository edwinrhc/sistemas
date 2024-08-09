package org.sifonavi.enlaces.appenlaces.controller;


import org.sifonavi.enlaces.appenlaces.model.Card;
import org.sifonavi.enlaces.appenlaces.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.sifonavi.enlaces.appenlaces.util.constantes.*;

@Controller
public class IndexController {

    @Autowired
    private CardService cardService;

    @GetMapping({"/"})
    public String index(@RequestParam(name="query", required = false) String query, Model model){
        List<Card> cards;
        if(query !=null && !query.isEmpty()){
            cards = cardService.searchCards(query);
        }else{
            cards = cardService.getCards();
        }
        //Agrupar las tarjetas por relevancia
        Map<String,List<Card>> groupedCards = cards.stream().collect(Collectors.groupingBy(Card::getRelevancia));

        // Inicializar las listas si son null
        List<Card> highRelevanceCards = groupedCards.getOrDefault("alta", Collections.emptyList());
        List<Card> mediumRelevanceCards = groupedCards.getOrDefault("media", Collections.emptyList());
        List<Card> lowRelevanceCards = groupedCards.getOrDefault("baja", Collections.emptyList());

        model.addAttribute("highRelevanceCards", highRelevanceCards);
        model.addAttribute("mediumRelevanceCards", mediumRelevanceCards);
        model.addAttribute("lowRelevanceCards", lowRelevanceCards);
        model.addAttribute("cards", cards);
        model.addAttribute("hasResults", !cards.isEmpty());

        // Año actual
        int currentYear = RELEASE_DATE;
        model.addAttribute("currentYear",currentYear);
        model.addAttribute("version", VERSION);
        model.addAttribute("title",TITLE);
        return "index";
    }


    @GetMapping("/test")
    public String test(){
        return "ola";
    }
}
