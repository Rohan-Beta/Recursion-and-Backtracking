// array is sorted or not

class Firstclass {
    public static void checkArray(int arr[] , int idx) {
        // idx means index of array , it is used to traverse in array
        
        if(idx == arr.length-1) {
            System.out.print("Sorted Array");
            return;
        }
        if(arr[idx] >= arr[idx+1]) {
            System.out.print("Unsorted Array");
            return;
        }
        checkArray(arr, idx+1);
    }
    public static void main(String args[]) {
        int arr[] = {1 , 2 , 3};
        checkArray(arr, 0);
    }
}
