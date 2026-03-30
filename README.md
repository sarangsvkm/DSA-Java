# DSA-Java

Java-based daily Data Structures and Algorithms practice repository. The project is organized by day, with each class solving one core interview-style array problem using a direct, readable implementation.

## Current Coverage

The repository currently focuses on basic array patterns:

- linear scan for max value
- hash map lookup for pair sum
- in-place array reordering
- tracking first and second maximum values

## Project Structure

```text
src/
  day01/
    LargestElement.java
    TwoSum.java
  day02/
    MoveZeroes.java
    SecondLargest.java
```

## Problem Analysis

### Day 01

#### 1. Largest Element
File: `src/day01/LargestElement.java`

Purpose:
Find the maximum value in an integer array.

Approach:
Initialize `max` with the first element, then scan the remaining elements. Whenever a larger value is found, update `max`.

Why this works:
After each iteration, `max` stores the largest element seen so far. By the end of the loop, it is the largest value in the full array.

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
Return the indices of two numbers whose sum equals a target value.

Approach:
Use a `HashMap` to store previously seen numbers and their indices. For each element, compute its complement as `target - nums[i]`. If that complement has already been seen, return both indices immediately.

Why this works:
The map allows constant-time lookup of the needed partner for each element, reducing the brute-force `O(n^2)` search to a single pass.

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
Move all zeroes to the end of the array while preserving the relative order of non-zero elements.

Approach:
Maintain a pointer `j` for the next position where a non-zero element should be placed. Traverse the array with `i`. Whenever a non-zero value is found, swap `arr[i]` and `arr[j]`, then increment `j`.

Why this works:
All non-zero values are compacted to the front in their original order, and zeroes naturally shift toward the end through swaps.

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
Track two values while scanning the array:

- `first` for the largest number seen so far
- `second` for the second largest distinct number

When a new maximum is found, shift the current `first` into `second`. Otherwise, update `second` only if the value is smaller than `first` and larger than the current `second`.

Why this works:
At every step, the pair (`first`, `second`) represents the two largest distinct values encountered up to that point.

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

## How to Compile and Run

From the project root:

```bash
javac -d out src/day01/LargestElement.java src/day01/TwoSum.java src/day02/MoveZeroes.java src/day02/SecondLargest.java
```

Run individual programs:

```bash
java -cp out day01.LargestElement
java -cp out day01.TwoSum
java -cp out day02.MoveZeroes
java -cp out day02.SecondLargest
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
- The project is centered on array fundamentals, making it suitable for early DSA revision.
- Compiled `.class` files are present inside both `src/` and `out/`; in a cleaner setup, compiled files should usually stay only in `out/`.

## Suggested Next Improvements

- add more problems by topic such as arrays, strings, linked lists, and recursion
- convert repeated demo logic into reusable helper methods where needed
- add edge-case handling for empty arrays and invalid inputs
- add a progress tracker table as more days are completed

## Progress Snapshot

- Day 01: `LargestElement`, `TwoSum`
- Day 02: `MoveZeroes`, `SecondLargest`
