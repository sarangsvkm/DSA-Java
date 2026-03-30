package day02;

//Find second largest number in array
//Input: [3, 7, 2, 9, 5]


public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            } else if(num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }
}


//Input: [3, 7, 2, 9, 5]
//Output: 7

// Complexity
//Time: O(n)
//Space: O(1)