package DragonCave.project.actions;

public abstract class Scripts {
    public String intro;
    public String die;
    public String live;
    public String playAgain;
    public String goodbye;
    public String number;
    public String string;

    // story methods
    public abstract void printIntro();
    public abstract void printDie();
    public abstract void printLive();
    public abstract void printPlayAgain();
    public abstract void printGoodbye();
    public String getIntro() { return intro; }
    public String getDie() { return die; }
    public String getLive() { return live; }
    public String getPlayAgain() { return playAgain; }
    public String getGoodbye() { return goodbye; }

    // error methods
    public abstract void printNumber();
    public abstract void printString();
    public String getNumber() { return number; }
    public String getString() { return string; }

}