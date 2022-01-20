package DragonCave.project.scripts;

interface _Story {
    // strings - story
    String intro = "Story introduction and instructions on using the program";
    String die= "Scenario in which character dies";
    String live = "Scenario in which character lives";
    String playAgain = "Prompt user to play game again";
    String goodbye = "Farewell to user when requesting to end program";
    // strings - errors
    String number = "User input invalid number";
    String string = "User input invalid string";

    // print strings - story scripts
    void printIntro();
    void printDie();
    void printLive();
    void printPlayAgain();
    void printGoodbye();
    // print - user input errors
    void printNumber();
    void printString();

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
