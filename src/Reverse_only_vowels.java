public class Reverse_only_vowels {
    public static void main(String[] args) {

        String input= "Hello";
        String vowelString = "aeiouAEOIU";

        char inputarray[] = input.toCharArray();
        int left =0;
        int right = inputarray.length-1;

        while(left<right){
            if(vowelString.indexOf(inputarray[left])==-1){
                left++;
            }
            else if(vowelString.indexOf(inputarray[right])==-1){
                right--;
        }else {
                char temp;
                temp = inputarray[left];
                inputarray[left]=inputarray[right];
                inputarray[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(input);
        System.out.println("Output :"+new String(inputarray));
    }
}
