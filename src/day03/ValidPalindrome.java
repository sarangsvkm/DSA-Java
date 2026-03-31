package day03;
//Check if a string is palindrome

//Input: "madam"

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "madam";

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                System.out.println(false);
                return;
            }
            left++;
            right--;
        }

        System.out.println(true);
    }
}





//Output: true

//⏱ Complexity
//Time: O(n)
//Space: O(1)