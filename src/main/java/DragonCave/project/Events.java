package DragonCave.project;

// imported custom packages
import DragonCave.project.scripts.Scripts;
import DragonCave.project.scripts.Story;
// imported utility packages
import java.util.Scanner;

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

    // Variable
    private String answer;
    private int number;
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

    // Setter
    private void setAnswer(String newAnswer) {
        this.answer = newAnswer;
    }
    private void setNumber(int newNumber) {
        this.number = newNumber;
    }

    // returns which user path choice
    public void play() {
        // start story
        System.out.println(intro);
        path();
    }

    // user input
    private void path() {
        Scanner scan = new Scanner(System.in);
        try {
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
            } else {
                answer = scan.nextLine();
                setAnswer(answer);
                if (answer.equals("quit") || answer.equals("q")) {
                    System.exit(0);
                } else if (answer.equals("restart")) {
                    play();
                } else {
                    System.out.println(errorNum);
                    path();
                }
            }
        } catch(Exception e){
            System.out.println("void method path error");
        }
        scan.close();
    }

    private void restart() {
        Scanner scan = new Scanner(System.in);
        try {
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
        } catch(Exception e) {
            System.out.println("void method restart error");
        }
        scan.close();
    }

    private void quit() {
        if (playAgain) {
            play();
        } else {
            System.exit(0);
        }
    }
}
