package lambaad;

import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Aditya Lamba Feb 1, 2023
 */
public class CardTrick {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Card[] hand = new Card[7];

        Random ran = new Random();

        for (int i = 0; i < hand.length; i++) {

            Card card = new Card();

            card.setValue(ran.nextInt(13) + 1);

            System.out.println(card.getValue());

            card.setSuit(Card.SUITS[ran.nextInt(4)]);

            hand[i] = card;

            // Hint: You can use Random -> random.nextInt(n) to get a random number between
            // 0 and n-1 (inclusive)
            // Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.

        System.out.println("Please pick a card value, where Aces =1, Jacks = 11, Queen = 12, and King = 13");

        int userValue = sc.nextInt();

        System.out.println("Please pick a card suit, where Hearts = 0, Diamond = 1, Spades = 2, and Clubs = 3");

        int userSuit = sc.nextInt();

        // Hint: You can ask for values 1 to 10, and then
        // 11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        // 1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        //
        // Then loop through the cards in the array to see if there's a match.

        String suit = "";

        switch (userSuit) {
        case 0:
            suit = "Hearts";
            break;
        case 1:
            suit = "Diamond";
            break;
        case 2:
            suit = "Spades";
            break;
        case 3:
            suit = "Clubs";
        }

        for (int i = 0; i < hand.length; i++) {
            if (userValue == hand[i].getValue() && suit.equals(hand[i].getSuit())) {
                System.out.println("Congratulations, you guessed right!");
            }
            
        }

        // If the guess is successful, print System.out.println("Congratulations, you
        // guessed right!");.

    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     * 
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();

    }

}