
import java.util.ArrayList;

public class Consonant {
    private static ArrayList<String> consonant = new ArrayList<>();
    private static String CONSONANT = "QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm";

    private static int min_length;
    private static String min_elem;

    public Consonant(ArrayList<String> in){
        for (int i = 0; i < in.size(); i++){
            if (CONSONANT.indexOf(in.get(i).charAt(0)) != -1){
                consonant.add(in.get(i));
            }
        }
    }

    public static String minElem(){
        min_length = consonant.get(0).length();
        min_elem = consonant.get(0);
        for (int i = 1; i < consonant.size(); i++){
            if (min_length > consonant.get(i).length()){
                min_length = consonant.get(i).length();
                min_elem = consonant.get(i);
            }
        }

        return min_elem;
    }

    public static ArrayList<String> getConsonant() {
        return consonant;
    }

    public static int getMinLength() {
        return min_length;
    }

    public static String getMinElem() {
        return min_elem;
    }

}
