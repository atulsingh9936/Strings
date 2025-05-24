import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters_Using_Sliding_Window_and_HashMap {

    public static int LengthofLongestSubstring(String str){

        int start =0;
        int maxlength =0;
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        for(int end =0;end <str.length();end ++){
            char curr = str.charAt(end);

            if (map.containsKey(curr)){
                start= Math.max(start, map.get(curr)+1);
            }
            map.put(curr,end);
            maxlength= Math.max(maxlength, end-start+1);
        }
        return  maxlength;
    }



    public static void main(String[] args) {

        String name ="abcabcbb";
      int ml =  LengthofLongestSubstring(name);
        System.out.println(ml);


    }
}
