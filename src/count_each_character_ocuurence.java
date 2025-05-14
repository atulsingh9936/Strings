import java.util.HashMap;
import java.util.Map;

public class count_each_character_ocuurence {

    public static void getcharacterCount(String name){
        Map<Character,Integer> charMap =new HashMap<Character,Integer>();
        char strArray[]=name.toCharArray();
        for(char c : strArray){
            if(!String.valueOf(c).isBlank()) {
                if (charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c) + 1);
                } else {
                    charMap.put(c, 1);
                }
            }

        }
        System.out.println(name+": "+ charMap);
    }


    public static void main(String[] args) {
//        getcharacterCount("test");
//        getcharacterCount("t");
//        getcharacterCount("yy");
//        getcharacterCount("testing java test");
//        getcharacterCount("t ");
//        getcharacterCount(" ");
        getcharacterCount(" sel sel sel ");

    }
}
