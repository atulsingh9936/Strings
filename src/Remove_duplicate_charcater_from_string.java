import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_charcater_from_string {
    public static void main(String[] args) {

        String name = "coconut";

        Set<Character> set = new LinkedHashSet<>();

        for(int i=0;i<name.length();i++){
            set.add(name.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for(Character c:set){
            sb.append(c);
        }
        System.out.println("String text after removing the duplicate characters are :"+sb);
    }
}
