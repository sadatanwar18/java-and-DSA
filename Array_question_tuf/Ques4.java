package Array_question_tuf;

public class Ques4 {

    // remove duplicates from the sorted array

    static int removeDuplicates(int arr[]){
        int i = 0;
        for (int j = 1; j< arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("elements are removing duplicates are ");
        for (int i = 0; i< k; i++){
            System.out.print(arr[i] +"");
        }
    }
}
