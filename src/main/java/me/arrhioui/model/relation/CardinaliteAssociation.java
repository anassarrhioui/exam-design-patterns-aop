package me.arrhioui.model.relation;

import java.io.Serializable;

public class CardinaliteAssociation  implements Serializable {

    private Cardinalite firstCard;
    private Cardinalite secondCard;


    public CardinaliteAssociation(Cardinalite firstCard, Cardinalite secondCard) {
        this.firstCard = firstCard;
        this.secondCard = secondCard;
    }

    @Override
    public String toString() {
        return "\n\t\tCardinaliteAssociation{" +
                "firstCard=" + firstCard +
                ", secondCard=" + secondCard +
                "}\n";
    }
}
