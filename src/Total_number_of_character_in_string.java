public class Total_number_of_character_in_string {
    public static void main(String[] args) {
        String name ="Hello Guys";
        int count =0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
