package DragonCave.project;

public class Main {

    public static void main(String[] args) {
        Events events = new Events();
        try {
            events.play();
        }
        catch(NullPointerException e) {
            System.out.println("Event Object Not Found");
        }
    }
}