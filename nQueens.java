// N Queens

import java.util.*;

class Firstclass {

    public static void printSolution(int arr[][]) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr[i][j] == 1) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.print("\n");
        }
    }

    public static boolean isSafe(int arr[][] , int x , int y , int n) {
        // x for rows , y for columns , n = number of queens

        for(int row = 0; row < x; row += 1) {
            if(arr[row][y] == 1) { // 1 means queen
                return false;
            }
        }
        // check left diagonal

        int row = x;
        int col = y;

        while(row >= 0 && col >= 0) {
            if(arr[row][col] == 1) {
                return false;
            }
            row--;
            col--;
        }
        // check right diagonal

        row = x;
        col = y;

        while(row >= 0 && col < n) {
            if(arr[row][col] == 1) {
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
    public static boolean nQueen(int arr[][] , int x , int y , int n) {

        // if all queens are already placed

        if(x >= n) {
            return true;
        }

        for(int col = 0; col < n; col += 1) {
            if(isSafe(arr, x, col, n)) {
                arr[x][col] = 1;

                if(nQueen(arr, x+1, y, n)) {
                    return true;
                }
                arr[x][col] = 0; // backtrack
            }
        }
        return false;
    }
    public static void main(String args[]) {

        int n = 4;

        int arr[][] = {{0 , 0 , 0 , 0},
                        {0 , 0 , 0 , 0},
                        {0 , 0 , 0 , 0},
                        {0 , 0 , 0 , 0}};

        
        if(nQueen(arr, 0, 0, n)) {
            printSolution(arr);
        }
    }
}
