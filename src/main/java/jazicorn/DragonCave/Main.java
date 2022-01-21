package jazicorn.DragonCave;

public class Main {

    public static void run() {
        // create event object to run program
        EventMenu menu = new EventMenu();
        try {
            menu.start();
        }
        catch(NullPointerException e) {
            System.out.println("Menu Object Not Found");
        }
    }

    public static void main(String[] args) {
        run();
    }
}