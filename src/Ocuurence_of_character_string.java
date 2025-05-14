public class Ocuurence_of_character_string {


    public static void getcharacter(String str, char val){
        int count =0;
        for(char ch:str.toCharArray()){
            if(ch==val){
                count++;
            }

        }
        System.out.println(val+ ":"+ count);
    }


    public static void main(String[] args) {

        String str ="I love coding and testing";
        getcharacter(str,'g');

    }
}
