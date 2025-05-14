import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_characacter_in_string {

    public static void PrintduplicateCharacters(String str){
        if(str==null){
            System.out.println("null string");
            return;
        }

        if(str.isEmpty()){
            System.out.println("Empty string");
            return;

        }
        if(str.length()==1){
            System.out.println("single character string");
            return;
        }


      char words[]=  str.toCharArray();
        Map<Character,Integer> charmap = new HashMap<Character,Integer>();
        for(Character ch :words){
            if (charmap.containsKey(ch)){
                charmap.put(ch,charmap.get(ch)+1);
            }else{
                charmap.put(ch,1);
            }
        }

        Set<Map.Entry<Character,Integer>> entryset=  charmap.entrySet();
        for(Map.Entry<Character,Integer> entry:entryset){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }


    }



    public static void main(String[] args) {
        PrintduplicateCharacters("A");
        PrintduplicateCharacters("");
        PrintduplicateCharacters(null);
        PrintduplicateCharacters("javata");
        PrintduplicateCharacters("Naveen");
        PrintduplicateCharacters("tesla");
        PrintduplicateCharacters("1000");

    }
}
