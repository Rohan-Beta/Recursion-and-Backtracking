// power calculate

class Firstclass {
    public static int powCal(int x , int n) { // x is base and n is power

        if(x == 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return powCal(x, n/2) * powCal(x, n/2);
        }
        else {
            return powCal(x, n/2) * powCal(x, n/2) * x;
        }
    }
    public static void main(String args[]) {
        System.out.print(powCal(2, 3));
    }
}
