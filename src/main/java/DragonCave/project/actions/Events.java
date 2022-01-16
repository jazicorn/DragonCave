package DragonCave.project.actions;

import java.util.Scanner;

public class Events {

    public boolean playAgain;
    public boolean error = false;
    public boolean quit = false;
    public int number;

    String[] option = {"yes", "no", "error", "quit"};

    Scripts.Story story = new Scripts.Story();
    Scripts.Error errors = new Scripts.Error();

    // returns which user path choice
    public void play() {
        Scanner scan = new Scanner(System.in);

        // script of user choice
        if (scan.hasNextInt()) {
            number = scan.nextInt();
            if (number == 1 || number == 2) {
                results();
                restart();
            } else{
                errors.numbers();
                play();
            }

        } else {
            String invalid = scan.nextLine();
            if (invalid.equals("quit") || invalid.equals("q")) {
                System.exit(0);
            }  else if(invalid.equals("story")) {
                story.start();
                play();
            }else {
                errors.numbers();
                play();
            }
        }
    }

    public void results() {
        if (number == 1) {
            story.Die();
        } else if (number == 2) {
            story.Live();
        } else {
          error = true;
        }
    }

    public void restart() {
        story.playAgain();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.equals(option[0])) {
            playAgain = true;
        } else if (input.equals(option[1])) {
            story.goodbye();
            playAgain = false;
        } else if (input.equals(option[2])) {
            error = true;
        } else if (input.equals(option[3])) {
            quit = false;
            story.goodbye();
            quit();

        } else {
            errors.strings();
            restart();
        }

    }

    public void quit() {
        if (quit) {
            System.exit(0);
        } else if (!playAgain) {
            System.exit(0);
        } else {
            assert true;
        }
    }

}
