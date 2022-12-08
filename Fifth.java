public class Fifth {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
        public static  boolean isPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;
            if(s.length() < 2) {
                return true;
            }

            while(j > i) {

                while(!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                    i++;
                }
                while(!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                    j--;
                }

                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
}
