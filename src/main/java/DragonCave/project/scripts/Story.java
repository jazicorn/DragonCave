package DragonCave.project.scripts;

public class Story extends Scripts {

    public String intro = String.format("\n%s",
        """
        You are in a land full of dragons. In front of you,
        and will share his treasure with you. The other dragon
        is greedy and hungry and will eat you on sight.
        Which cave will you go into? (1 or 2)
        """
    );

    public String die = String.format("\n%s",
        """
        You approach the cave...
        It is dark and spooky...
        A large dragon jumps out in front of you! He opens his jaws and...
        Gobbles you down in one bite!
        """
    );

    public String live = String.format("\n%s",
        """
        You approach the cave...It is dark and spooky...
        You journey deeper and deeper into the cave...
        You reach a door lit by a torch on each side..
        You open the heavy and squeaky door...
        The room is filled with treasure!
        Your heart jumped quickly with excitement as you admired the gold and jewels pilled in front of you.
        Just as you were about to take step forward steps forward...
        "Welcome!", a voiced boomed.
        You looked up to see a massive golden eyed dragon, towering over the mountain od treasure.
        "As a reward for making it this far. I will gift you with a treasure. Choose wisely!", declared the Dragon.
        """
    );

    public String playAgain = String.format("\n%s",
        """
        "Do you want to play again?"
        Please Enter y or n:
        """
    );

    public String goodbye = String.format("\n%s",
        """
        See you on your next adventure! :)
        """
    );

    // set errors
    public String number = String.format("%s\n",
        """
        Please enter a valid response: 1 or 2.
        """
    );

    public String string = String.format("%s\n",
        """
        Please enter a valid response: y or n
        """
    );

    // void methods - story
    public void printIntro() { System.out.println(intro);}
    public void printDie() { System.out.println(die);}
    public void printLive() { System.out.println(live);}
    public void printPlayAgain() { System.out.println(playAgain);}
    public void printGoodbye() { System.out.println(goodbye);}
    // void methods - errors
    public void printNumber() { System.out.println(number);}
    public void printString() { System.out.println(string);}

    // get string methods - story
    public String getIntro() { return intro; }
    public String getDie() { return die; }
    public String getLive() { return live; }
    public String getPlayAgain() { return playAgain; }
    public String getGoodbye() { return goodbye; }
    // get string methods - errors
    public String getNumber() { return number; }
    public String getString() { return string; }

}
