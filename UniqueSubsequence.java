// Unique subsequence string

import java.util.*;

class Firstclass {
    public static void UniqueSubsequence(String str , int idx , String newStr , HashSet<String> set) {

        if(idx == str.length()) {
            if(set.contains(newStr)) {
                return;
            }
            else {
                System.out.print(newStr + "\n");
                set.add(newStr);
                return;
            }
        }

        char currChr = str.charAt(idx);

        // to be
        UniqueSubsequence(str, idx+1, newStr+currChr , set);

        // not to be
        UniqueSubsequence(str, idx+1, newStr, set);
    }
    public static void main(String args[]) {
        HashSet<String> set =  new HashSet<>();
        UniqueSubsequence("aaa", 0, "", set);
    }
}
