package org.sifonavi.enlaces.appenlaces.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card implements Comparable<Card>{

    private String title;

    private String url;

    private String relevancia;


    @Override
    public int compareTo(Card other){
        return this.title.compareTo(other.title);
    }
}
