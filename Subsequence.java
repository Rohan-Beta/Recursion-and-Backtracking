// subsequence string

import java.util.*;

class Firstclass {
    public static void subsequence(String str , int idx , String newStr) {

        if(idx == str.length()) {
            System.out.print(newStr + "\n");
            return;
        }
        char currChr = str.charAt(idx);

        // to be
        subsequence(str, idx+1, newStr+currChr);

        // no to be
        subsequence(str, idx+1, newStr);
    }
    public static void main(String args[]) {
        subsequence("aaa", 0, "");
    }
}
