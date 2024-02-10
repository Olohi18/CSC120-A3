import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) { //Shortcut:psvm tab}

    int secretNum = 7;
    Boolean stillPlaying = true;
    Scanner sc = new Scanner(System.in); // to read user's guesses

    System.out.println("Welcome to my guessing game");
    System.out.println("I'm thinking of a numbr between 1 and 10");


    while (stillPlaying) {

        int userGuess = sc.nextInt();


        if (userGuess == secretNum) {
            System.out.println("Congratulations");
            stillPlaying = false;
        }
        //python equivalent elif
        else if (userGuess > 10 || userGuess < 1){
            System.out.println("Sorry, out of range!");
        }
        else {
            System.out.println("Sorry that wasn't it. Guess again");

        }
    }
    sc.close();}


}