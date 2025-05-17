public class Space_count {


    public static int spaceCount(String inputstring){
        int count =0;
        for(int i=0;i<inputstring.length();i++){
          char c =  inputstring.charAt(i);
          if (c==' '){
              count++;
          }

        }
        return  count++;
    }


    public static void main(String[] args) {
      int p =  spaceCount("this is atul");
        System.out.println(p);




    }
}
