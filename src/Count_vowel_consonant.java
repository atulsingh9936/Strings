public class Count_vowel_consonant {
    public static void main(String[] args) {
        String str = "hello";
      str=  str.toLowerCase();
      int vowels =0; int consonant =0;

      for(char c : str.toCharArray()){
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
              vowels++;
          }else{
              consonant++;

          }

        }
        System.out.println("No of vowels: "+vowels);
        System.out.println("No of consonant: "+ consonant);
    }
}
