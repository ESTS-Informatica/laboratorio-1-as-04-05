import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class WordGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGenerator{
    private ArrayList<String> word;
    
    
    public WordGenerator(){
        word=new ArrayList<>();
        fillArrayList();
    }
    
    private void fillArrayList(){
        word.add("boolean");
        word.add("break");
        word.add("byte");
        word.add("case");
        word.add("char");
        word.add("class");
        word.add("continue");
        word.add("do");
        word.add("double");
        word.add("else");
        word.add("enum");
        word.add("for");
        word.add("if");
        word.add("inport");
        word.add("int");
    }
    public String generateWord(){
        Random r = new Random();
        int rand = r.nextInt(word.size()-1) ;
        return word.get(rand);
    }
    public void addWord(String newWord){
        word.add(newWord);
    }
    
}
