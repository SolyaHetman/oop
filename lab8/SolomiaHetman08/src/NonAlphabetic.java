
import java.util.ArrayList;

public class NonAlphabetic {
    private static ArrayList<String> nonAlpha = new ArrayList<>();

    private static int min_length;
    private static String min_elem;

    public NonAlphabetic(ArrayList<String> in){
        for (int i = 0; i < in.size(); i++){
            if (!Character.isAlphabetic(in.get(i).charAt(0))){
                nonAlpha.add(in.get(i));
            }
        }
    }

    public static String minElem(){
        min_length = nonAlpha.get(0).length();
        min_elem = nonAlpha.get(0);
        for (int i = 1; i < nonAlpha.size(); i++){
            if (min_length > nonAlpha.get(i).length()){
                min_length = nonAlpha.get(i).length();
                min_elem = nonAlpha.get(i);
            }
        }

        return min_elem;
    }

    public static int getMinLength() {
        return min_length;
    }

    public static String getMinElem() {
        return min_elem;
    }

    public static ArrayList<String> getNonAlpha() {
        return nonAlpha;
    }
}