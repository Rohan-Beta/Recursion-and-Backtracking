// invite guest

import java.util.*;

class Firstclass {
    public static int invite(int n) {

        if(n <= 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        int single = invite(n-1);

        int pair = invite(n-2) * (n-1);

        return single + pair;
    }
    public static void main(String args[]) {
        System.out.print(invite(4));
    }
}
