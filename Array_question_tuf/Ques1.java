package Array_question_tuf;


// Find largest element in an array

public class Ques1 {
    public static void main(String[] args) {

        
        int arr1[] =  {2,5,1,3,0};

        System.out.println(largestelement(arr1));
    }

    static int largestelement (int arr[]){
            int max = arr[0];
            for (int i = 0; i < arr.length ; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
    }
}
