public class Reverse_a_string_2 {
    public static void main(String[] args) {
        String name ="The Testing Academy";
        String reversedstring ="";
        int len = name.length();
        for(int i= len-1;i>=0;i--){
          //  System.out.print(name.charAt(i));
            reversedstring=reversedstring+name.charAt(i);
        }
        System.out.println(reversedstring);

    }
}
