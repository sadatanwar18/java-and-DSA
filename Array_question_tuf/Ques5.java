package Array_question_tuf;

public class Ques5 {
    static void rotate(int[] arr, int n){
        int temp = arr[0];
        for (int i = 1; i<n; i++){
           arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        rotate(arr,n);
    }


}

