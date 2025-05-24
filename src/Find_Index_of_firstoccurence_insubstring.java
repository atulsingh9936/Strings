public class Find_Index_of_firstoccurence_insubstring {
    public static void main(String[] args) {

        String haystack="sadbutsad";
        String needle ="sad";

        System.out.println(strstr(haystack, needle));

    }

public static int strstr(String haystack,String needle){
        return  haystack.indexOf(needle);
}

}
