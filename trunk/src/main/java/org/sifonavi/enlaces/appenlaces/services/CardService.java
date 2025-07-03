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
                cards.add(new Card("Registro F0",  "https://www.fonavi-st.gob.pe/registro0/","alta"));
                cards.add(new Card("Registro F1",  "https://www.fonavi-st.gob.pe/registro1/pages/","alta"));
                cards.add(new Card("Estado de Registro",  "https://www.fonavi-st.gob.pe/sifonavic1/","alta"));

                cards.add(new Card("Grupo de Pago","https://www.fonavi-st.gob.pe/sifonavic2/","alta"));
                cards.add(new Card("Consulta Cerad",  "https://www.fonavi-st.gob.pe/sifonavic5/","alta"));

                cards.add(new Card("Pendiente de Cobro",  "https://www.fonavi-st.gob.pe/sifonavic3/","alta"));
                cards.add(new Card("Publicación Herederos",  "https://www.fonavi-st.gob.pe/sifonavic4/","alta"));
                cards.add(new Card("Búsqueda Empleadores",  "https://www.fonavi-st.gob.pe/empleadorf1/busca_empleador.htm","alta"));
                cards.add(new Card("SAAU",  "https://www.fonavi-st.gob.pe/saac2/","alta"));
                cards.add(new Card("SAUI", "https://www.fonavi-st.gob.pe/saci/","alta"));

                cards.add(new Card("Portal Web",  "https://fonavi-st.pe/","alta"));
                cards.add(new Card("Portal Aplicaciones", "https://www.fonavi-st.gob.pe/sifonavi/","alta"));
                cards.add(new Card("CI",  "http://10.0.13.214:8080/pci/pago.jsp","alta"));
                cards.add(new Card("SIPA", "http://10.0.13.214:8080/mpago/pago.jsp","alta"));
//                cards.add(new Card("Registro Herederos", "#","alta"));

                cards.add(new Card("GOB.PE",  "https://www.gob.pe/fonavi-st","media"));
                cards.add(new Card("Portal PTE",  "https://www.transparencia.gob.pe/enlaces/pte_transparencia_enlaces.aspx?id_entidad=38934#.Yp_PSnbMKUl","media"));
                cards.add(new Card("SGD",  "https://sgd.fonavi-st.gob.pe/sgd/login.do","media"));
                cards.add(new Card("MPV",  "https://sgd.fonavi-st.gob.pe/iotramitesgd/login.jsf","media"));
                cards.add(new Card("GDR",  "https://gdr.servir.gob.pe/#/auth/login","media"));


                cards.add(new Card("Beneficiados",  "http://10.0.13.214:8080/beneficiado/login","baja"));
                cards.add(new Card("STD", "http://10.0.13.214:8080/std/","baja"));
//        cards.add(new Card("MPV",  "https://sgd.fonavi-st.gob.pe/iotramitesgd/login.jsf","baja"));
                cards.add(new Card("SIMA",  "http://10.0.13.214:8080/sima/","baja"));
                cards.add(new Card("Archivo",  "http://10.0.13.214:8080/archivo/","baja"));
                cards.add(new Card("MASS",  "http://10.0.13.214:8080/mass/login","baja"));


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
