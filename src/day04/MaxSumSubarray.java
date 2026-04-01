package day04;
//Find max sum of subarray of size k
//
//Input: [2,1,5,1,3,2], k=3
//Output: 9  (subarray [5,1,3])
public class MaxSumSubarray {


        public static void main(String[] args) {
            int[] arr = {2,1,5,1,3,2};
            int k = 3;

            int sum = 0;

            // first window
            for(int i = 0; i < k; i++) {
                sum += arr[i];
            }

            int maxSum = sum;

            for(int i = k; i < arr.length; i++) {
                sum += arr[i];        // add next
                sum -= arr[i - k];    // remove first
                maxSum = Math.max(maxSum, sum);
            }

            System.out.println(maxSum);
        }
}

