public class Remove_junk_character_from_string {
    public static void main(String[] args) {

        String s = "Hello@#%World123!";
      s=  s.replaceAll("[^a-zA-z0-9]","");
        System.out.println(s);

    }
}
