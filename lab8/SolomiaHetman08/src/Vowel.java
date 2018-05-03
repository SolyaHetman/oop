
import java.util.ArrayList;

public class Vowel {
    private static ArrayList<String> vowel = new ArrayList<>();
    private static String VOWELS = "AEUIOaeuio";

    private static int min_length;
    private static String min_elem;

    public Vowel(ArrayList<String> in){
        for (int i = 0; i < in.size(); i++){
            if (VOWELS.indexOf(in.get(i).charAt(0)) != -1){
                vowel.add(in.get(i));
            }
        }
    }

    public static String minElem(){
        min_length = vowel.get(0).length();
        min_elem = vowel.get(0);
        for (int i = 1; i < vowel.size(); i++){
            if (min_length > vowel.get(i).length()){
                min_length = vowel.get(i).length();
                min_elem = vowel.get(i);
            }
        }

        return min_elem;
    }

    public static ArrayList<String> getVowel() {
        return vowel;
    }

    public static int getMinLength() {
        return min_length;
    }

    public static String getMinElem() {
        return min_elem;
    }
}




