package Array_question_tuf;

public class Ques3 {

    // check if array is sorted

    static boolean sorted(int arr[]){
        for (int i = 1; i< arr.length; i++){
            if (arr[i] >= arr[i-1] ){

            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5};
        System.out.println(sorted(arr));
    }
}
