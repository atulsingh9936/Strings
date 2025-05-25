public class coomon_charcater_Three_strings {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2=   "aedif";
        String str3 ="heade";

        String common ="";

        for (char c :str1.toCharArray()){
            if(str1.indexOf(c)!=-1 && str2.indexOf(c)!= -1 && str2.indexOf(c)!= -1){
                common= common+c;
            }
        }
        System.out.println("common created: "+ common);
    }
}
