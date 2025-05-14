public class Count_character {
    public static void main(String[] args) {
        String input = "Welcome to my channel";
        char ch ='n';
        int count =0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("count Character:"+count);
    }
}
