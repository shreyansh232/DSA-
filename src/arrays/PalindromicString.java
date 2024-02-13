package arrays;
import java.util.*;

public class PalindromicString {
        public static String firstPalindrome(String[] words) {
            for(int str = 0; str < words.length; str++){
                if (isPalindrome(words[str])){
                    return words[str];
                }
            }
            return "";
        }
        public static boolean isPalindrome(String str){
            if(str== null || str.length() == 0){
                return false;
            }
            for(int i = 0; i < str.length()/2; i++){
                char start = str.charAt(i);
                char end = str.charAt(str.length() - 1 - i);

                if(start != end){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        // Example usage:
        String[] wordsArray = {"hello", "level", "world", "radar", "java"};
        String result = firstPalindrome(wordsArray);
        System.out.println(result);
    }
}
