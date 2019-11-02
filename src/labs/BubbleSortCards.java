package labs;

import java.util.Arrays;

public class BubbleSortCards {
    public void bubbleSortCards(Card[] cards) {
        for (int sorted = 0; sorted < cards.length - 1; sorted++) {
            for (int i = 0; i < cards.length - sorted - 1; i++) {
                if (cards[i].compareto(cards[i+1]) > 0) {
                    Card temp = cards[i];
                    cards[i] = cards[i+1];
                    cards[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(cards));
    }

}
