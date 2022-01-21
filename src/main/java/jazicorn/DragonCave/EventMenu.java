package jazicorn.DragonCave;

import jazicorn.DragonCave.scripts._Template;
import java.util.*;

public class EventMenu implements _Menu {

    // run menu
    boolean running;

    // user input
    Scanner scan = new Scanner(System.in);

    public void start() {
        mainMenu();
    }

    public void play() {
        EventStory story = new EventStory();
        story.play();
    }

    private void quit() {
        System.exit(0);
    }

    // user int input
    public int userInput() {
        int input;
        try {
            scan.hasNextInt();
        } catch (InputMismatchException e) {
            String error = "Input Error: Number Only";
            System.out.println(error);
        }
        input = scan.nextInt();
        return input;
    }

    // main menu
    public void mainMenu() {
        printDragonCave();

        String secret;
        int result;

        try {
            result = userInput();
            if (result == 1) {
                play();
            }
            if (result == 2) {
                printGoodbye();
                quit();
            }
        } catch(NumberFormatException e) {
            System.out.println("Input Error: Choose Number 1 or 2");
            start();
        } finally {
            secret = scan.nextLine();
            if (secret.equals("secret")) {
                secretMenu();
            }
            System.out.println("Input Error: Choose Number 1 or 2");
            start();
        }
    }

    public void secretMenu() {

        printSecret();
        int result = userInput();

        EventMenu menuEvent = new EventMenu();

        HashMap<Integer, Runnable> mainMenu = new HashMap<>();

        mainMenu.put(1, menuEvent::start);
        mainMenu.put(2, menuEvent::menuStrings);

        running = true;
        while(running) {
            try {
                switch (result) {
                    case (1) -> mainMenu.get(1).run();
                    case (2) -> mainMenu.get(2).run();
                }
                running = false;
            } catch (NumberFormatException e) {
                running = false;
                secretMenu();
                System.out.println("Input Error: Choose Number 1 or 2");
            }
        }
    }

    public void menuStrings() {

        printStrings();
        int result = userInput();

        EventMenu menuEvent = new EventMenu();
        _Template menuStory = new _Template();

        // Declare Hashmap
        HashMap<Integer, Runnable> commands = new HashMap<>();

        // Add elements to HashMap
        commands.put(0, menuEvent::secretMenu);
        commands.put(1, menuStory::printIntro);
        commands.put(2, menuStory::printDie);
        commands.put(3, menuStory::printLive);
        commands.put(4, menuStory::printPlayAgain);
        commands.put(5, menuStory::printGoodbye);
        commands.put(6, menuStory::printNumber);
        commands.put(7, menuStory::printString);

        running = true;
        while (running) {
            try {
                switch (result) {
                    case (0) -> commands.get(0).run();
                    case (1) -> commands.get(1).run();
                    case (2) -> commands.get(2).run();
                    case (3) -> commands.get(3).run();
                    case (4) -> commands.get(4).run();
                    case (5) -> commands.get(5).run();
                    case (6) -> commands.get(6).run();
                    case (7) -> commands.get(7).run();
                }
                running = false;
                menuStrings();
            } catch (InputMismatchException e) {
                running = false;
                menuStrings();
                System.out.println("Input Error: Choose Number Between 1 - 7");
            }
        }

    }

}
