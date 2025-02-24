/**
 * Write a description of class WordGuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame{
    private String hiddenWord="abc";
    private String guessedWord="___";
    private int numberOfTries=0;
    private InputReader reader;
    private WordGenerator wg;
    
    public WordGuessingGame(){
        this.reader= new InputReader();
        wg= new WordGenerator();
        hiddenWord=wg.generateWord();
        guessedWord=initializeGuesseWord();
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public String getGuessedWord() {
        return guessedWord;
    }

    public void setGuessedWord(String guessedWord) {
        this.guessedWord = guessedWord;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    private void showGuessedWord(){
        System.out.println( "Palavra escondida : "+ guessedWord  ) ;
    }
    
    public void play(){
        showWelcome();
        do{
            guess(reader.getChar("Introduza um caracter: "));
        }while((!(guessedWord.equals(hiddenWord))));
        showGuessedWord();
        showResults();
    }

    private void showWelcome(){
        System.out.println(" BEM VINDO \n");
    }
    
    private void guess(char word){
    if(hiddenWord.contains(""+word)){
        char [] newWord = guessedWord.toCharArray();
        for(int i=0;i<newWord.length;i++){
            if(hiddenWord.charAt(i) == word){
                newWord[i] = word;
            }
        }
        guessedWord = String.valueOf(newWord);
        System.out.println(guessedWord);
    }
    numberOfTries++;
    }
    
    private void showResults(){
        System.out.println("Numero de vezes: " + numberOfTries);
    }
    
    public String initializeGuesseWord(){
         StringBuilder guessedWord = new StringBuilder();
        for (int i = 0; i < hiddenWord.length(); i++) {
            guessedWord.append("_");
        }
        return guessedWord.toString();
    }  
    
    public void reset() {
        hiddenWord = wg.generateWord();
        guessedWord = initializeGuesseWord();
        numberOfTries = 0;
    }

}












