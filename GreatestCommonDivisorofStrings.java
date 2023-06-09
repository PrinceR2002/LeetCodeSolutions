public class GreatestCommonDivisorofStrings {

    /*For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
    Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

    Example 1:

    Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
    Example 2:

    Input: str1 = "ABABAB", str2 = "ABAB"
    Output: "AB"
    Example 3:

    Input: str1 = "LEET", str2 = "CODE"
    Output: ""*/

    public static void main(String[] args) {

        //Test Cases:

        gcdOfStrings("ABCABC", "ABC");
        gcdOfStrings("ABABAB", "ABAB");
        gcdOfStrings("LEET", "CODE");

    }
    public static String gcdOfStrings(String str1, String str2) {

        //If the strings are different depending on how they are added then there are no common divisors available
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        System.out.println(str1.substring(0, gcdLength));
        return str1.substring(0, gcdLength);

    }

    private static int gcd(int x, int y) {
        if( y == 0){
            return x;
        }
        else{
            return gcd(y, x % y);
        }
    }
}