
public class ReverseVowels {
    public static void main(String[] args) {


    }
//Vowels: e, u, i, o, a,
    public String reverseVowels(String s){

        char[] sChar = s.toCharArray();
        int n = sChar.length;

        //
        int l = 0; int r = n -1;

        while(l < r){

            //inreamants LEFT pointer until it runs into a vowel
            while(l < n && !isVowel(sChar[l])){
                l++;
            }

            //decreamants RIGHT pointer until it runs into a vowel
            while(r >= 0 && !isVowel(sChar[r])){
                r--;
            }

            //breaks the while loop after pointers cross each other
            if(l >= r){
                break;
            }

            //Swaps vowels
            swap(sChar, l , r);
            l++; r--;

        }

        return new String(sChar);
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public void swap(char[] sChar, int i, int j){
        char temp = sChar[i];
        sChar[i] = sChar[j];
        sChar[j] = temp;

    }

}