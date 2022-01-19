package DragonCave.project;

public class Main {

    public static void main(String[] args) {
        // create event object to run program
        Events events = new Events();
        try {
            events.play();
        }
        catch(NullPointerException e) {
            System.out.println("Event Object Not Found");
        }
    }
}