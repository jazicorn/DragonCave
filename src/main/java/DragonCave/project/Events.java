package DragonCave.project;

// imported custom packages
import DragonCave.project.scripts.Scripts;
import DragonCave.project.scripts.Story;
// imported utility packages
import java.util.*;

public class Events {

    // story strings
    private String intro;
    private String live;
    private String die;
    private String restart;
    private String goodbye;
    // error strings
    private String errorStr;
    private String errorNum;

    // user string answer
    private String answer;
    // user number answer
    private int number;
    // user choice - play again
    private boolean playAgain;

    // create story object - to implement story scripts
    Scripts story = new Story();
    // assign story methods to strings
    protected Events() {
        try {
            intro = story.getIntro();
            live = story.getLive();
            die = story.getDie();
            restart = story.getPlayAgain();
            goodbye = story.getGoodbye();
            errorStr = story.getString();
            errorNum = story.getNumber();
        } catch(NullPointerException e) {
            System.out.println("Story method returns null");
        }
    }

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
        System.out.println(intro);
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
                System.out.println(die);
                restart();
            } else if (number == 2) {
                // prints scenario live
                System.out.println(live);
                restart();
            } else {
                System.out.println(errorNum);
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
                System.out.println(errorNum);
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
            System.out.println(restart);
            answer = scan.nextLine();
            setAnswer(answer);
            // changes playAgain boolean to false if user selects "n"
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
