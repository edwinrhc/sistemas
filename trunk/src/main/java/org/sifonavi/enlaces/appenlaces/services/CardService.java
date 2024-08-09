package org.sifonavi.enlaces.appenlaces.services;

import org.sifonavi.enlaces.appenlaces.model.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardService {

    private List<Card> cards;

    public CardService() {
        cards = new ArrayList<>();
        cards.add(new Card("Portal ST-Fonavi","https://fonavi-st.pe/","alta"));
        cards.add(new Card("Página ST-Fonavi",  "https://www.fonavi-st.gob.pe/sifonavi/","alta"));
        cards.add(new Card("SAAU",  "https://www.fonavi-st.gob.pe/saac2/","media"));
        cards.add(new Card("SAUI", "https://www.fonavi-st.gob.pe/saci/","media"));
        cards.add(new Card("PCI",  "http://10.0.13.214:8080/pci/pago.jsp","media"));
        cards.add(new Card("SIPA", "http://10.0.13.214:8080/mpago/","media"));
        cards.add(new Card("Beneficiados",  "http://10.0.13.214:8080/sisbene/","media"));

        cards.add(new Card("STD", "http://10.0.13.214:8080/std/","baja"));
        cards.add(new Card("SGD",  "https://sgd.fonavi-st.gob.pe/sgd/login.do","baja"));
        cards.add(new Card("MPV",  "https://sgd.fonavi-st.gob.pe/iotramitesgd/login.jsf","baja"));
        cards.add(new Card("SIMA",  "http://10.0.13.214:8080/sima/","baja"));
        cards.add(new Card("Archivo",  "http://10.0.13.214:8080/archivo/","baja"));

//        // Ordenar la lista de tarjetas
//        Collections.sort(cards);
//
//        //Numerar los títulos
//        for(int i = 0; i < cards.size(); i++){
//            Card card = cards.get(i);
//            card.setTitle((i + 1)+". "+ card.getTitle());
//        }

    }

    public List<Card> getCards(){
        return  cards;
    }

    public List<Card> searchCards(String query){
        return cards.stream()
                .filter(card -> card.getTitle().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
