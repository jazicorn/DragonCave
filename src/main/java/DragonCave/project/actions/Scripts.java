package DragonCave.project.actions;

public class Scripts {

    public static class Story {

        public String intro; // program instructions
        public String scenario1; // Die
        public String scenario2; // Live
        public String playAgain; // playAgain prompt
        public String goodbye; // exit message

        // Story intro
        public void start() {
            intro = String.format("\n%s",
                """
                You are in a land full of dragons. In front of you,
                and will share his treasure with you. The other dragon
                is greedy and hungry and will eat you on sight.
                Which cave will you go into? (1 or 2)
                """
            );
            System.out.println(intro);
        }

        public void Die() {
            // Scenario 1
            // Die
            scenario1 = String.format("\n%s",
                """
                You approach the cave...
                It is dark and spooky...
                A large dragon jumps out in front of you! He opens his jaws and...
                Gobbles you down in one bite!
                """
            );
            System.out.println(scenario1);
        }

        public void Live() {
            // Scenario 2
            // Live
            scenario2 = String.format("\n%s",
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
            System.out.println(scenario2);
        }

        public void playAgain() {
            playAgain = String.format("\n%s",
                """
                "Do you want to play again?"
                Please Enter yes or no:
                """
            );
            System.out.println(playAgain);
        }
        public void goodbye() {
            goodbye = String.format("\n%s",
                """
                "Do you want to play again?"
                Please Enter yes or no:
                """
            );
            System.out.println(goodbye);
        }
    }

    public static class Error {

        public String number; // invalid - number
        public String reEnter; // invalid response
        public String string; // invalid - string

        public void numbers() {

            number = String.format("%s\n",
                """
                Please enter a valid response: 1 or 2.
                """
            );
            System.out.println(number);
        }

        public void invalid() {

            reEnter = String.format("%s\n",
                """
                Please try again.
                """
            );
            System.out.println(reEnter);
        }

        public void strings() {

            string = String.format("%s\n",
                """
                Please enter a valid response: Yes or No
                """
            );
            System.out.println(string);
        }

    }

}
