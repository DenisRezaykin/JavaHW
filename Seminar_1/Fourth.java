public class Fourth {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        int start=0;
        for(int i=0; i<=s.length(); i++){
            if(i==s.length() || s.charAt(i)==' '){
                if(i>start) sb.insert(0,s.substring(start,i)+" ");
                start=i+1;
            }
        }
        return sb.length()==0? "" : sb.substring(0,sb.length()-1);
    }
}
