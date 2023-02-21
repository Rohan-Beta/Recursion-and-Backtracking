// keypad combination

import java.util.*;

class Firstclass {
    public static String[] keypad = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqr" , "stu" , "vwx" , "yz"};

    public static void keyComb(String str , int idx , String comb) {

        if(idx == str.length()) {
            System.out.print(comb + "\n");
            return;
        }
        char currChr = str.charAt(idx);

        String mapping = keypad[currChr - '0'];

        for(int i = 0; i < mapping.length(); i += 1) {
            keyComb(str, idx+1, comb+mapping.charAt(i));
        }
    }
    public static void main(String args[]) {
        keyComb("23", 0, "");
    }
}
