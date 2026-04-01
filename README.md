# DSA-Java

A Java-based Data Structures and Algorithms practice repository organized day by day. Each day focuses on a small set of interview-style problems and keeps the implementation direct, readable, and easy to run from the command line or IntelliJ IDEA.

## Goals

- build consistency through daily DSA practice
- keep each solution beginner-friendly and easy to trace
- cover core patterns before moving to advanced topics
- maintain a simple project structure without extra framework setup

## Current Topics Covered

The repository currently includes problems from:

- array traversal
- hashing
- two pointers
- frequency counting
- sliding window

## Project Structure

```text
src/
  day01/
    LargestElement.java
    TwoSum.java
  day02/
    MoveZeroes.java
    SecondLargest.java
  day03/
    ValidAnagram.java
    ValidPalindrome.java
  day04/
    LongestSubstring.java
    MaxSumSubarray.java
out/
README.md
```

## Progress Tracker

| Day | Problems | Core Pattern |
| --- | --- | --- |
| 01 | Largest Element, Two Sum | linear scan, hash map |
| 02 | Move Zeroes, Second Largest | in-place array update, tracking best values |
| 03 | Valid Anagram, Valid Palindrome | frequency map, two pointers |
| 04 | Longest Substring Without Repeating Characters, Maximum Sum Subarray of Size K | sliding window |

## Problem Breakdown

### Day 01

#### 1. Largest Element
File: `src/day01/LargestElement.java`

Purpose:
Find the largest value in an integer array.

Approach:
Start with the first element as the current maximum and scan the rest of the array. Update the maximum whenever a larger value is found.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample:
```java
int[] arr = {3, 7, 2, 9, 5};
```

Expected output:
```text
9
```

#### 2. Two Sum
File: `src/day01/TwoSum.java`

Purpose:
Find the indices of two numbers whose sum equals a target value.

Approach:
Use a `HashMap` to store visited values and their indices. For each number, check whether its complement already exists in the map.

Complexity:
- Time: `O(n)`
- Space: `O(n)`

Sample:
```java
int[] nums = {2, 7, 11, 15};
int target = 9;
```

Expected output:
```text
Indices: [0, 1]
```

### Day 02

#### 3. Move Zeroes
File: `src/day02/MoveZeroes.java`

Purpose:
Move all zeroes to the end while preserving the order of non-zero elements.

Approach:
Maintain a pointer for the next non-zero placement. Traverse the array and swap non-zero values forward.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample:
```java
int[] arr = {0, 1, 0, 3, 12};
```

Expected output:
```text
1 3 12 0 0
```

#### 4. Second Largest Element
File: `src/day02/SecondLargest.java`

Purpose:
Find the second largest distinct element in an array.

Approach:
Track the largest and second largest values while scanning once through the array.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample:
```java
int[] arr = {3, 7, 2, 9, 5};
```

Expected output:
```text
Second Largest: 7
```

### Day 03

#### 5. Valid Anagram
File: `src/day03/ValidAnagram.java`

Purpose:
Check whether two strings contain the same characters with the same frequencies.

Approach:
Compare lengths first, then use a `HashMap` to count characters from one string and reduce counts using the second string.

Complexity:
- Time: `O(n)`
- Space: `O(n)`

Sample:
```java
String s = "listen";
String t = "silent";
```

Expected output:
```text
true
```

#### 6. Valid Palindrome
File: `src/day03/ValidPalindrome.java`

Purpose:
Check whether a string reads the same forward and backward.

Approach:
Use two pointers, one from the start and one from the end, and compare mirrored characters while moving inward.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample:
```java
String s = "madam";
```

Expected output:
```text
true
```

### Day 04

#### 7. Longest Substring Without Repeating Characters
File: `src/day04/LongestSubstring.java`

Purpose:
Find the length of the longest substring with all unique characters.

Approach:
Use a sliding window with a `HashSet`. Expand the right pointer, and when a duplicate appears, shrink the window from the left until the duplicate is removed.

Why this works:
The current window always contains unique characters, so each valid expansion can be used to update the best answer.

Complexity:
- Time: `O(n)`
- Space: `O(n)`

Sample:
```java
String s = "abcabcbb";
```

Expected output:
```text
3
```

#### 8. Maximum Sum Subarray of Size K
File: `src/day04/MaxSumSubarray.java`

Purpose:
Find the maximum sum among all contiguous subarrays of fixed size `k`.

Approach:
Compute the first window sum, then slide the window by adding the incoming element and removing the outgoing element.

Why this works:
Every window of size `k` is evaluated in constant time after the first one, avoiding repeated full-sum calculations.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample:
```java
int[] arr = {2, 1, 5, 1, 3, 2};
int k = 3;
```

Expected output:
```text
9
```

## How to Compile and Run

### Compile all files

```bash
javac -d out src/day01/*.java src/day02/*.java src/day03/*.java src/day04/*.java
```

### Run individual programs

```bash
java -cp out day01.LargestElement
java -cp out day01.TwoSum
java -cp out day02.MoveZeroes
java -cp out day02.SecondLargest
java -cp out day03.ValidAnagram
java -cp out day03.ValidPalindrome
java -cp out day04.LongestSubstring
java -cp out day04.MaxSumSubarray
```

### Compile and run a single file

```bash
javac -d out src/day04/LongestSubstring.java
java -cp out day04.LongestSubstring
```

## Notes

- Most files include a `main` method for quick manual execution.
- The repository is currently focused on clarity over abstraction.
- `out/` is the correct place for compiled classes.
- There are `.class` files inside `src/day01`; those should ideally be removed from source folders in a later cleanup.

## Suggested Next Steps

- add linked list, stack, queue, recursion, and binary search problems
- add edge-case handling for empty arrays and invalid inputs
- add brief comments only where the logic is not obvious
- create topic-wise folders later if the repository grows beyond daily practice format
