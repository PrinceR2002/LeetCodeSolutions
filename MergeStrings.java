public class MergeStrings {
//LeetCode 1768. Merge String Alternately

   /* Input: word1 = "abc", word2 = "pqr"
    Output: "apbqcr"
    Explanation: The merged string will be merged as so:
    word1:  a   b   c
    word2:    p   q   r
    merged: a p b q c r*/
    public static void main(String[] args){

        //test cases:
         mergeAlternately("abc", "pqr");
         mergeAlternately("ab", "pqrs");
         mergeAlternately("abcd", "pq");

    }
    public static String mergeAlternately(String word1, String word2) {
        //Two Pointers

        //Storing the result in a StringBuilder
        StringBuilder result = new StringBuilder();

        //lengths of words
        int one = word1.length(); int two = word2.length();

        //pointers
        int i = 0; int j = 0;

        //Using a while loop until it goes through either of the words chars.
        while(i < one || j < two) {
            //Appends each letter in to the result String
            if (i < one) {
                result.append(word1.charAt(i++));
            }
            //Appends each letter into the result string after the initial if statement
            if(j < two){
                result.append(word2.charAt(j++));
            }
        }
        System.out.println(result.toString());

        return result.toString();


    }


}
