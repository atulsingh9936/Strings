import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str = "Listen";
        String str1 = "silent";

        str= str.toLowerCase();
        str1=str1.toLowerCase();

        if(str.length()!=str1.length()){
            System.out.println("Strings length are not equal are not anagram");
        }else{
            char[] String1=str.toCharArray();
            char[] String2=str1.toCharArray();
            Arrays.sort(String1);
            Arrays.sort(String2);
            if(Arrays.equals(String1,String2)==true){
                System.out.println("String are anagram");

            }else{
                System.out.println("String are not anagram");
            }
        }

    }
}
