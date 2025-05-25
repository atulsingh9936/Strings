public class Find_length_of_string_without_using_length_method {
    public static void main(String[] args) {
        String str = "Hello";
        int length=0;
        for (char ch : str.toCharArray()){
            length++;
        }
        System.out.println("Length of String:"+length);
    }
}
