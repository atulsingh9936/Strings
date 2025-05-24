public class Java_program_to_swap_to_two_strings {
    public static void main(String[] args) {
        String a = "hi";
        String b ="hello";
        a = a+b;
        b = a.substring(0,a.length()-b.length());
        a= a.substring(b.length());
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
