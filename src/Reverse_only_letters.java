import java.util.Arrays;

public class Reverse_only_letters {
    public static void main(String[] args) {
        String input="1ab2";
        int left =0;
        int right = input.length()-1;
        char input_array[] =   input.toCharArray();

     while(left<right){
         if(!Character.isLetter(input_array[left])){
             left++;
         } else if (!Character.isLetter(input_array[right])) {
             right--;
             
         }else{
             char temp=input_array[left];
             input_array[left]=input_array[right];
             input_array[right]=temp;
             left ++;
             right--;

         }
     }

        System.out.println("Output:"+ Arrays.toString(input_array));
        System.out.println("Output:"+ new String(input_array));
    }
}
