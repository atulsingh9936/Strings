import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_words_ina_string {
    public static void main(String[] args) {
        findduplicateWords("Hey java is java best language is java");
        findduplicateWords("Hey python is not java but best language is python not java");

    }


    public static void findduplicateWords(String inputString){

        // split
        String words[] =inputString.split(" ");

        Map<String, Integer> wordsCount = new HashMap<String,Integer>();

        for (String word:words){
             if (wordsCount.containsKey(word)){

                 wordsCount.put(word.toLowerCase(),wordsCount.get(word)+1);
             }else{
                 wordsCount.put(word,1);
             }
        }


      Set<String> wordsinString = wordsCount.keySet();
        for(String word: wordsinString)
        if(wordsCount.get(word)>1){
            System.out.println(word+":"+wordsCount.get(word));
        }

    }
}
