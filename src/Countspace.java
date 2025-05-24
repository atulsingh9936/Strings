public class Countspace {
    public static void main(String[] args) {
        String str = "this is a String";
        char c[] = str.toCharArray();
        int count = 0;
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
                count++;
            }
        }
        System.out.println("total space count: "+count);

    }
}