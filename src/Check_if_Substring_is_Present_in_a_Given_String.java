public class Check_if_Substring_is_Present_in_a_Given_String {

public static boolean isSubstring(String main, String sub){
    return main.matches("(.*)"+ sub +"(.*)");
}




public static void main(String[] args) {

        System.out.println(isSubstring("naveen automation labs","labs"));
        System.out.println(isSubstring("naveen automation labs","naveen"));
        System.out.println(isSubstring("naveen automation labs","testing"));
        System.out.println(isSubstring("naveen automation labs $$ special","$$"));
        System.out.println(isSubstring("naveen automation labs","labs"));
        System.out.println(isSubstring("automation","auto"));
        System.out.println(isSubstring("automation","ti"));
        System.out.println(isSubstring("automation","a"));
        System.out.println(isSubstring("automation11","11"));
        System.out.println(isSubstring("automation11","1"));
        System.out.println(isSubstring("automation",null));

    }
}
