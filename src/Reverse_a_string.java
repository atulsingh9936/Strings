public class Reverse_a_string {
    public static void main(String[] args) {
        String name ="Atul Singh";
        String ReversedString ="";
        for(int i=name.length()-1;i>=0;i--){
          ReversedString= ReversedString+(name.charAt(i));
        }
        System.out.println(ReversedString);

    }
}
