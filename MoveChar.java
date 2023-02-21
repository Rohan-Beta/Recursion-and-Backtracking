// move x on the right side of a string

import java.util.*;

class Firstclass {
    public static void move(String str , int idx , int count , String newStr) {
        // str means oldString , idx means index , newstr means newString
        // count is used to count number of x

        if(idx == str.length()) {
            for(int i = 0; i < count; i += 1) {
                newStr += 'x';
            }
            System.out.print(newStr);
            return;
        }

        char currChr = str.charAt(idx);

        if(currChr == 'x') {
            count++;
            move(str, idx+1, count, newStr);
        }
        else {
            newStr += currChr;
            move(str, idx+1, count, newStr);
        }
    }
    public static void main(String args[]) {
        move("axbxxd", 0, 0, "");
    }
}
