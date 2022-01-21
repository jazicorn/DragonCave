package jazicorn.DragonCave;

public interface _Menu {

    String dragonCave = String.format("\n%s",
            """
            DragonCave
            --- --- ---
            Do you want to play DragonCave?
            Start?
            --- --- ---
            1. Yes
            2. No
            """);

    String secret = String.format("\n%s",
            """
            Welcome to the Secret Menu!
            --- --- ---
            It contains definitions used to create game.
            If you just want to play the game, choose (1) to return to game intro.
            If you want to look up string definitions choose (2)
            --- --- ---
            1. Play Game (return to main menu)
            2. Strings
            """);

    String strings = String.format("\n%s",
            """
            Strings!
            --- --- ---
            Choose 0 to return to secret menu
            Choose a number between 1 - 7 to get a definition.
            --- --- ---
            0. Secret Menu
            --- --- ---
            1. intro
            2. die
            3. live
            4. play again
            5. goodbye
            6. error - number
            7. error - string
            """);

    String goodbyes = "Goodbye!";

    default void printDragonCave() {System.out.println(dragonCave);}
    default void printSecret() {System.out.println(secret);}
    default void printStrings() {System.out.println(strings);}
    default void printGoodbye() {System.out.println(goodbyes);}

    default String getSecret() {return secret;}
    default String getStrings() {return strings;}
    default String getGoodbye() {return goodbyes;}

}
