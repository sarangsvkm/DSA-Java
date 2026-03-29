package day01;

public class LargestElement {
        public static void main(String[] args) {
            int[] arr = {3, 7, 2, 9, 5};

            int max = arr[0];  // step 1

            for(int i = 1; i < arr.length; i++) {
                if(arr[i] > max) {
                    max = arr[i]; // step 2 & 3
                }
            }

            System.out.println(max);
        }
    }
