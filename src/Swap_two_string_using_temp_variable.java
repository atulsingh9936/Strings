public class Swap_two_string_using_temp_variable {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";

        String temp;
        temp = string1;
        string1= string2;
        string2=temp;

        System.out.println(string1);
        System.out.println(string2);
    }
}
