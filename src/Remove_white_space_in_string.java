public class Remove_white_space_in_string {
    public static void main(String[] args) {

        String str ="java  Programming    selenium     automation";
      str=  str.replaceAll("\\s","");
        System.out.println(str);



    }
}
