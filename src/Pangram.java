
public class Pangram {
    public static void main(String[] args) {

        String input ="The quick brown fox jumps over the lazy dog";
        input = input.toLowerCase();
      boolean result =  checkAnagram(input);
      if(result){
          System.out.println("Its a pangram");
      }
      else{
          System.out.println("Its not an pangram");
      }
    }

    public static Boolean checkAnagram(String input) {
        if(input.length()<26){
            return  false;
        }
        for(int i='a';i<='z';i++){
            if(input.indexOf(i)<0){
                return false;
            }
        }

        return  true;


    }
}
