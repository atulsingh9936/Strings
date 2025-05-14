public class Duplicate_character_in_string {
    public static void main(String[] args) {
        String str = new String("Automation");
      char ch[] =  str.toCharArray();
      int count =0;
      for(int i=0;i<ch.length;i++){
          for(int j=i+1;j<ch.length;j++){
              if(ch[i]==ch[j]){
                  System.out.println("The duplicates characters in string are :"+ ch[j]);
                  count++;
              }
          }
      }
        System.out.println("duplicate character count :"+ count);
    }
}
