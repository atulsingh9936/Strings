import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class find_and_remove_duplicate_charcaters {
    public static void main(String[] args) {

        // Collecting the input from user in the form of string text
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string text containing duplicate characters in it");
      String inputtext=  sc.nextLine();
      sc.close();


      // for removing the duplicate characters in the above user entered string text

        char[] ic = inputtext.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for(char c:ic){
            set.add(c);
        }

        // Printing the resultant string text which dont contain duplicate characters

        StringBuilder sb = new StringBuilder();
        for(Character e: set){
            sb.append(e);
        }

        System.out.println(sb);





    }
}
