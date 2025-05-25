import java.util.Arrays;

public class Split_an_array_into_string {
    public static void main(String[] args) {
        String str = "Hello world";
      String[] words =  str.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
