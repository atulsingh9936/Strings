public class Reverse_each_word_in_string {
    public static void main(String[] args) {
    /*    String str = "Welcome to java";
      String[] words= str.split(" ");

      String reversedstring ="";


      for(String w:words){
          String reverseword="";
          for(int i=w.length()-1;i>=0;i--){
              reverseword= reverseword+w.charAt(i);
          }

          reversedstring = reversedstring+reverseword+" ";
      }


        System.out.println(reversedstring);*/


        //Approach 2
        String str="welcome to java";

     String[] words=   str.split("\\s");

     String reversedword=" ";

     for(String w:words){
         StringBuilder sb = new StringBuilder(w);
         sb.reverse();
         reversedword = reversedword+sb.toString()+" ";
     }
        System.out.println(reversedword);
     }

}
