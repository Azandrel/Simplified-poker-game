import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("It's like Poker, but a lot simpler.\n");

        System.out.println(
            "• There are two players, you and the computer.\n" + 
            "• The dealer will give each player one card.\n" + 
            "• Then, the dealer will draw five cards (the river)\n" + 
            "• The player with the most river matches wins!\n" + 
            "• If the matches are equal, everyone's a winner!\n");
        
        System.out.println("• Ready? Press enter if you are.");

        String readyCheck = scan.nextLine();

        System.out.println("Here's your card:");
        String playerCard = randomCard();
        System.out.println(playerCard);

        System.out.println("\nHere's the computer's card:");
        String computerCard = randomCard();
        System.out.println(computerCard);

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
       

        int yourMatches = 0;
        int computerMatches =0;

        for (int i = 1; i < 6; i++) {
            String nextCard = scan.nextLine();
            System.out.println("Card " + i);
            String swimLaneCard = randomCard();
            System.out.println(swimLaneCard);
            if (swimLaneCard.equals(playerCard)){
                yourMatches += 1;
            } else if (swimLaneCard.equals(computerCard)) {
                computerMatches += 1;
            }
        }
        
        if (yourMatches > computerMatches) {
            System.out.println("You win");
        } else if (yourMatches < computerMatches) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a draw");
        }

         scan.close();
    }

    public static String randomCard() {
        int randomCard = (int) (Math.random() * 13) + 1;
        String card = "";

        switch (randomCard) {
            case 1: card =
                "   _____\n"+
                "  |A _  |\n"+ 
                "  | ( ) |\n"+
                "  |(_'_)|\n"+
                "  |  |  |\n"+
                "  |____V|\n"; break;
            case 2: card =
                "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n"; break;
            case 3: card =
                "   _____\n" +
                "  |3    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____E|\n"; break;
            case 4: card =
                "   _____\n" +
                "  |4    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  | o o |\n"+
                "  |____h|\n"; break;
            case 5: card =
                "   _____ \n" +
                "  |5    |\n" +
                "  | o o |\n" +
                "  |  o  |\n" +
                "  | o o |\n" +
                "  |____S|\n"; break;
            case 6: card =
                "   _____ \n" +
                "  |6    |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  |____6|\n"; break;
            case 7: card =
                "   _____ \n" +
                "  |7    |\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |____7|\n"; break;
            case 8: card =
                "   _____ \n" +
                "  |8    |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  |____8|\n"; break;
            case 9: card =
                "   _____ \n" +
                "  |9    |\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |____9|\n"; break;
            case 10: card =
                "   _____ \n" +
                "  |10  o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |___10|\n"; break;
            case 11: card =
                "   _____\n" +
                "  |J  ww|\n"+ 
                "  | o {)|\n"+ 
                "  |o o% |\n"+ 
                "  | | % |\n"+ 
                "  |__%%[|\n"; break;
            case 12: card =
                "   _____\n" +
                "  |Q  ww|\n"+ 
                "  | o {(|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%O|\n"; break;
            case 13: card =
                "   _____\n" +
                "  |K  WW|\n"+ 
                "  | o {)|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%>|\n"; break;
        }
        return card;
    }
}
