/** String processing exercise 1. */
public class lowercase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if ((int)(s.charAt(i)) <= 90 && (int)(s.charAt(i)) >= 65) {
                answer += (char)((int)(s.charAt(i))+32);
            }else{
                answer += s.charAt(i);
            }
            
        }
        return answer;
    }
}