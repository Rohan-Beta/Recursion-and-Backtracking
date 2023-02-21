// place tiles

import java.util.*;

class Firstclass {
    public static int placeTiles(int n , int m) {

        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        int vertically = placeTiles(n-m, m);

        int horizontacally = placeTiles(n-1, m);

        return vertically + horizontacally;
    }
    public static void main(String args[]) {
        System.out.print(placeTiles(4 , 2));
    }
}
