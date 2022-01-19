package DragonCave.project.actions;

import java.util.Scanner;

public class Events {

    // story strings
    String intro;
    String live;
    String die;
    String restart;
    String goodbye;
    // error strings
    String errorStr;
    String errorNum;

    // Variable
    private String answer;
    private int number;
    private boolean playAgain;

    // create story object - to implement story scripts
    Scripts story = new Story();
    // assign story methods to strings
    public Events() {
        intro = story.getIntro();
        live = story.getLive();
        die = story.getDie();
        restart = story.getPlayAgain();
        goodbye = story.getGoodbye();
        errorStr = story.getString();
        errorNum = story.getNumber();
    }

    // Setter
    public void setAnswer(String newAnswer) {
        this.answer = newAnswer;
    }
    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    // returns which user path choice
    public void play() {
        // start story
        System.out.println(intro);
        path();
    }

    // user input
    public void path() {
        Scanner scan = new Scanner(System.in);
        // script of user choice
        if (scan.hasNextInt()) {
            number = scan.nextInt();
            setNumber(number);
            if (number == 1) {
                System.out.println(die);
                restart();
            } else if (number == 2) {
                System.out.println(live);
                restart();
            } else {
                System.out.println(errorNum);
                path();
            }
        }  else {
            answer = scan.nextLine();
            setAnswer(answer);
            if (answer.equals("quit") || answer.equals("q")) {
                System.exit(0);
            }  else if(answer.equals("restart")) {
                play();
            }else {
                System.out.println(errorNum);
                path();
            }
        }
        scan.close();
    }

    public void restart() {
        Scanner scan = new Scanner(System.in);
        System.out.println(restart);
        answer = scan.nextLine();
        setAnswer(answer);

        if (answer.equals("y") || answer.equals("Y")) {
            playAgain = true;
        } else if (answer.equals("n") || answer.equals("N")) {
            System.out.println(goodbye);
            playAgain = false;
        } else {
            System.out.println(errorStr);
            restart();
        }
        quit();
        scan.close();
    }

    public void quit() {
        if (playAgain) {
            play();
        } else {
            System.exit(0);
        }
    }
}
