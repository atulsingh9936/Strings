public class string_is_palindrome_or_not {
    public static void main(String[] args) {
        String name ="madam";
        String actual_string=name;
        String ReversedString ="";
        for(int i=name.length()-1;i>=0;i--){
            ReversedString= ReversedString+(name.charAt(i));
        }
       if(actual_string.equals(ReversedString)){
           System.out.println("string is palindrome");
       }else{
           System.out.println("not a palindrome");
       }
    }
}
