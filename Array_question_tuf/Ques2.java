package Array_question_tuf;

public class Ques2 {

    // second largest and second smallest element in an array

    static int secondlargest(int arr[], int n){
        int large = arr[0];
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i< n; i++){
            if (arr[i] > large){
                second_large = large;
               large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {

               second_large = arr[i];

            }
        }

        return second_large;
    }

    static int secondsmallest(int arr[], int n){
        int small = arr[0];
        int second_small = Integer.MAX_VALUE;

        for (int i = 0; i< n; i++){
            if (arr[i] < small){
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];

            }
        }
        return second_small;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int n = arr.length;

        int sl = secondlargest(arr,n);
        int ss = secondsmallest(arr,n);

        System.out.println("Second largest element in this array is "  + sl);
        System.out.println("second smallest element in this array is " + ss);
    }



}
