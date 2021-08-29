public class HeyNeedle {
    public static void main(String[] args) {
        
        String  haystack = "hello", needle = "lo";

        int hl = haystack.length();
        int nl = needle.length();
        if(nl==0){
            System.out.println(0);
        }
        int flag=-1;
        for(int i =0; i<hl-nl+1; i++){
            System.out.println(haystack.substring(i,i+nl));
            if(haystack.substring(i,i+nl).equals(needle)){
                flag=i;
                break;
            }
        }
        System.out.println(flag);
    }
}
