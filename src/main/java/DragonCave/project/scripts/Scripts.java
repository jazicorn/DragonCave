package DragonCave.project.scripts;

public abstract class Scripts {
    public String intro;
    public String die;
    public String live;
    public String playAgain;
    public String goodbye;
    public String number;
    public String string;

    // story methods
    public String getIntro() { return intro; }
    public String getDie() { return die; }
    public String getLive() { return live; }
    public String getPlayAgain() { return playAgain; }
    public String getGoodbye() { return goodbye; }

    // error methods
    public String getNumber() { return number; }
    public String getString() { return string; }

}