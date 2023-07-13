package Java_arrays;

public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {3,44,2,34,24,24,43};
        System.out.println(maxrange(arr, 1, 4));
    }


    static int maxrange(int[] arr, int start, int end){
        int maxval = arr[start];
        for (int i = start; i<= end; i++){
            if (arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

}
