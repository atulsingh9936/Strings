public class Reverse_a_word_in_string {
    public static void main(String[] args) {
        String str ="My Name is Navin";
        String str1=" ";
        String a[] =str.split(" ");
        for(int i=a.length-1;i>=0;i--){
            str1= str1+a[i]+" ";
        }
        System.out.println(str1);
    }
}
