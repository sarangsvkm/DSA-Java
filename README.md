# DSA-Java

Java-based daily Data Structures and Algorithms practice repository. The project is organized by day, with each class solving one core interview-style problem using direct and readable Java implementations.

## Current Coverage

The repository currently covers basic patterns from arrays and strings:

- linear scan for maximum value
- hash map lookup for pair sum
- in-place array reordering
- tracking first and second maximum values
- palindrome checking with two pointers
- anagram validation with character frequency counting

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
```

## Problem Analysis

### Day 01

#### 1. Largest Element
File: `src/day01/LargestElement.java`

Purpose:
Find the largest value in an integer array.

Approach:
Initialize `max` with the first element, then scan the rest of the array. Whenever a bigger value is found, update `max`.

Why this works:
After each iteration, `max` stores the largest element seen so far. By the end of the loop, it represents the maximum value in the full array.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample input:
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
Return the indices of two numbers whose sum equals a target.

Approach:
Use a `HashMap` to store each visited number and its index. For every element, compute `target - nums[i]` and check whether that complement already exists in the map.

Why this works:
The map provides constant-time lookup for the needed partner of each element, turning the brute-force `O(n^2)` search into a single pass.

Complexity:
- Time: `O(n)`
- Space: `O(n)`

Sample input:
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
Move all zeroes to the end of the array while keeping the order of non-zero elements unchanged.

Approach:
Maintain a pointer `j` for the next position where a non-zero value should go. Traverse the array with `i`, and whenever `arr[i]` is non-zero, swap `arr[i]` with `arr[j]` and increment `j`.

Why this works:
Non-zero elements are compacted at the front in their original order, while zeroes shift naturally toward the end.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample input:
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
Find the second largest distinct value in an integer array.

Approach:
Track two variables while scanning the array:

- `first` for the largest value seen so far
- `second` for the second largest distinct value

When a new largest value is found, move the old `first` into `second`. Otherwise, update `second` only when the current number is smaller than `first` but larger than the current `second`.

Why this works:
At every step, `first` and `second` store the two largest distinct values encountered up to that point.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample input:
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
Check whether two strings are anagrams of each other.

Approach:
First compare the lengths of both strings. If they differ, return `false`. Otherwise, count the frequency of each character from the first string using a `HashMap`, then reduce those counts while scanning the second string.

Why this works:
Two strings are anagrams only if they contain the same characters with the same frequencies. Matching counts across both strings verifies that condition.

Complexity:
- Time: `O(n)`
- Space: `O(n)`

Sample input:
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
Use two pointers, one from the start and one from the end. Compare characters at both pointers and move inward while they match.

Why this works:
If every mirrored pair of characters matches, the string is a palindrome. A mismatch at any point proves it is not.

Complexity:
- Time: `O(n)`
- Space: `O(1)`

Sample input:
```java
String s = "madam";
```

Expected output:
```text
true
```

## How to Compile and Run

From the project root:

```bash
javac -d out src/day01/*.java src/day02/*.java src/day03/*.java
```

Run individual programs:

```bash
java -cp out day01.LargestElement
java -cp out day01.TwoSum
java -cp out day02.MoveZeroes
java -cp out day02.SecondLargest
java -cp out day03.ValidAnagram
java -cp out day03.ValidPalindrome
```

If you want to run directly from `src`, compile a single file and use the package-qualified class name.

Example:

```bash
javac src/day01/TwoSum.java
java -cp src day01.TwoSum
```

## Observations About the Current Code

- The solutions are intentionally simple and beginner-friendly.
- Each file currently contains its own `main` method for quick execution.
- The repository now includes both array and string fundamentals for early DSA revision.
- Compiled `.class` files are present inside both `src/` and `out/`; in a cleaner setup, compiled files should usually stay only in `out/`.

## Suggested Next Improvements

- add more problems by topic such as linked lists, stacks, queues, and recursion
- add edge-case handling for empty inputs and invalid data
- keep compiled files out of `src/`
- add a progress tracker table as more days are completed

## Progress Snapshot

- Day 01: `LargestElement`, `TwoSum`
- Day 02: `MoveZeroes`, `SecondLargest`
- Day 03: `ValidAnagram`, `ValidPalindrome`
