package Java_arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr ={2,434,23,24,1232};
        System.out.println(max(arr));
    }


    static int max(int[] arr){
        int maxval = arr[0];
        for (int i = 1; i< arr.length; i++){
            if (arr[i] > maxval ){
                maxval = arr[i];
            }

        }
        return maxval;
    }
}
