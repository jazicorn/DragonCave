package DragonCave.project;

import DragonCave.project.actions.Events;
import DragonCave.project.actions.Scripts;

public class Main {

    public static void run() {
        Scripts.Story story = new Scripts.Story();
        story.start();

        Events events = new Events();
        events.play();
        events.quit();
    }

    public static void main(String[] args) {
        Events events = new Events();
        do {
            run();
        } while(!events.quit || !events.playAgain);
    }
}