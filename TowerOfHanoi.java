// tower of hanoi

class Firstclass {
    public static void tower(int idx , String src , String helper , String dest) {
        // idx means number od disk , src means source , helper means helper ,dest means destination
    
        if(idx <= 0) {
            System.out.print("Inavlid!");
            return;
        }
        if(idx == 1) {
            System.out.print("Disk " + idx + " transfer from " + src + " to " + dest + "\n");
            return;
        }
        tower(idx-1, src, dest, helper);
        System.out.print("Disk " + idx + " transfer from " + src + " to " + dest + "\n");

        tower(idx-1, helper, src, dest);
    }
    public static void main(String args[]) {
        tower(3, "S", "H", "D");
    }
}
