package jazicorn.DragonCave;

import jazicorn.DragonCave.scripts.DragonCave;
import java.util.*;

public class EventStory {
    // create story object - to print story scripts
    DragonCave story = new DragonCave();

    // user string answer
    private String answer;
    // user number answer
    private int number;
    // user choice - play again
    private boolean playAgain;

    // Set user answers
    private void setAnswer(String newAnswer) {
        this.answer = newAnswer;
    }
    private void setNumber(int newNumber) {
        this.number = newNumber;
    }

    // starts program
    public void play() {
        // start story
        story.printIntro();
        path();
    }

    // prompts user scenario choice
    private void path() {
        Scanner scan = new Scanner(System.in);
        try {
            number = scan.nextInt();
            setNumber(number);
            if (number == 1) {
                // prints scenario die
                story.printDie();
                restart();
            } else if (number == 2) {
                // prints scenario live
                story.printLive();
                restart();
            } else {
                story.printNumber(); // error number input
                path();
            }
        } catch (InputMismatchException e){
            // takes in prompt that isn't a number
            answer = scan.nextLine();
            setAnswer(answer);
            if (answer.equals("quit") || answer.equals("q")) {
                // exits program
                System.exit(0);
            } else if (answer.equals("restart")) {
                // starts program from beginning
                play();
            } else {
                // prints error message and replays path method
                story.printNumber(); // error number input
                path();
            }
        }
        scan.close();
    }

    // ask player if they want to play again or exit program
    private void restart() {
        Scanner scan = new Scanner(System.in);
        try {
            // ask user if they want to replay game
            story.printPlayAgain();
            answer = scan.nextLine();
            setAnswer(answer);
            // changes playAgain boolean to false if user selects "n"
            if (answer.equals("y") || answer.equals("Y")) {
                playAgain = true;
            } else if (answer.equals("n") || answer.equals("N")) {
                story.printGoodbye();
                playAgain = false;
            } else {
                story.printString(); // error string input
                restart();
            }
            quit();
        } catch(Exception e) {
            System.out.println("void method restart error");
        }
        scan.close();
    }

    // exits program if playAgain is false
    private void quit() {
        if (playAgain) {
            play();
        } else {
            System.exit(0);
        }
    }
}
