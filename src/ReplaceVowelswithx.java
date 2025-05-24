public class ReplaceVowelswithx {
    public static void main(String[] args) {

        String input = "NAme";
       // input = input.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (char currentchar:input.toCharArray()){
            if(isVowel(currentchar)){
                result.append("x");

            }else{
                result.append(currentchar);
            }
        }
        System.out.println(result.toString());
    }

    public static boolean isVowel(char currentchar){
        if(currentchar=='a'||currentchar=='e'||currentchar=='i'||currentchar=='o'||currentchar=='u'||currentchar=='A'||currentchar=='E'||currentchar=='I'||currentchar=='O'||currentchar=='U'){
            return  true;
        }else{
            return false;
        }
    }
}
