// maze count

import java.util.*;

class Firstclass {
    public static int mazeCount(int i , int j , int n , int m) {

        if(i == n || j == m) {
            return 0;
        }
        if(i == n-1 && j == m-1) {
            return 1;
        }

        int downpath = mazeCount(i+1, j, n, m);
        int rightpath = mazeCount(i, j+1, n, m);

        return downpath + rightpath;
    }
    public static void main(String args[]) {

        System.out.print(mazeCount(0, 0, 3, 3));
    }
}
