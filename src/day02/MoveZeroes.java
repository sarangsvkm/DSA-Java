package day02;

//Move all 0s to end (keep order same)
//Input: [0,1,0,3,12]



public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}


//Output: [1,3,12,0,0]