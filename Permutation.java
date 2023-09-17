// Permutation

import java.util.*;

class firstclass {
    public static void Permutation(String str , String perm) {
        if(str.length() == 0) {
            System.out.print(perm + "\n");
            return;
        }

        for(int i = 0; i < str.length(); i += 1) {
            char currchr = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i+1);
            Permutation(newstr, perm+currchr);
        }
    }
    public static void main(String args[]) {
        Permutation("abc", " ");
    }
}
// number of input equals to number of factorial
// i.e "abc" = 3!
