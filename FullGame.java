public class FullGame {
    private WordGuessingGame wgg;
    private InputReader reader;
    
    /**
     * Constructor for objects of class FullGame.
     */
    public FullGame() {
        wgg = new WordGuessingGame();
        reader = new InputReader();
    }
    
    /**
     * Plays the game, allowing the user to continue guessing words.
     */
    public void play() {
        String continuePlay = "S";
        while (continuePlay.equalsIgnoreCase("S")) {
            wgg.play();
            wgg.reset();
            System.out.println("Continuar a jogar ? (S/N)");
            continuePlay = String.valueOf(reader.getChar("")).toUpperCase();
        }
    }
}
