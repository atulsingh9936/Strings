import org.w3c.dom.ls.LSOutput;

public class String_character_occurence {
    public static void main(String[] args) {
        String s = "Java Programming java oops";
        int totalcount = s.length();
      int countafterremove=  s.replace("a","").length();

      int count = totalcount-countafterremove;
        System.out.println("the count of occuurence of character is "+count);
    }

}
