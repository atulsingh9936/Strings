import java.util.StringJoiner;

public class String_joiner {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[","]");
        joiner.add("Tom")
                .add("Lisa")
                .add("Naveen");
        System.out.println(joiner.toString());
    }
}
