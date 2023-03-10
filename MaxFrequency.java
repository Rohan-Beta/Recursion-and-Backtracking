class Firstclass {

    public static int mostFrequency(int arr[] , int n) {

        int max = 0;
        int freq = 0;

        for(int i = 0; i < arr.length; i += 1) {
            int count = 0;

            for(int j = 0; j < arr.length; j += 1) {
                if(arr[i] == arr[j]) {
                    count += 1;
                }
            }
            if(count >= max) {
                max = count;
                freq = arr[i];
            }
        }
        return freq;
    }
    public static void main(String args[]) {

        int arr[] = {1 , 20 , 20 , 3 , 4};
        int n = arr.length;

        System.out.println(mostFrequency(arr, n));
    }
}
