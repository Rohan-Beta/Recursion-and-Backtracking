// remove duplicates

import java.util.*;

class Firstclass {
    public static boolean[] map = new boolean[26];

    public static void duplicates(String str , int idx , String newStr) {

        if(idx == str.length()) {
            System.out.print(newStr + " ");
            return;
        }
        char currChr = str.charAt(idx);

        if(map[currChr - 'a'] == true) {
            duplicates(str, idx+1, newStr);
        }
        else {
            newStr += currChr;
            map[currChr - 'a'] = true;

            duplicates(str, idx+1, newStr);
        }
    }
    public static void main(String args[]) {
        duplicates("aabbcdee", 0, "");
    }
}
