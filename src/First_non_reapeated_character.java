import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First_non_reapeated_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string text");

        String str = sc.nextLine().toLowerCase();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        boolean status = false;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.get(ch)==null){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.get(ch)==1){
                System.out.println("first non repeated character in the given string text is "+ch);
                status= true;

                break;
            }
        }
        if(!status){
            System.out.println("There is no  unique character in the given string text ");
        }
    }
}
