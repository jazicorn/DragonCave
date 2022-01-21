package jazicorn.DragonCave.scripts;

public interface _Script {
    // strings - story
    String intro = String.format("\n%s",
            """
            Introduction and instructions on using the program
            """);
    String die= "Scenario in which character dies";
    String live = "Scenario in which character lives";
    String playAgain = "Prompt user to play game again";
    String goodbye = "Farewell to user when requesting to end program";
    // strings - errors
    String number = "User input invalid number";
    String string = "User input invalid string";

    // print strings - story scripts
    default void printIntro() {System.out.println(intro);}
    default void printDie() {System.out.println(die);}
    default void printLive() {System.out.println(live);}
    default void printPlayAgain() {System.out.println(playAgain);}
    default void printGoodbye() {System.out.println(goodbye);}
    // print - user input errors
    default void printNumber() {System.out.println(number);}
    default void printString() {System.out.println(string);}

    // get string - story
    String getIntro();
    String getDie();
    String getLive();
    String getPlayAgain();
    String getGoodbye();
    // get string - errors
    String getNumber();
    String getString();

}
