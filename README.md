# DSA-Java

A Java practice repository for daily Data Structures and Algorithms problems. Each day focuses on a small set of beginner-friendly interview patterns with direct implementations and runnable `main` methods.

## Topics Covered

- array scanning
- hash map lookups
- in-place array transformation
- tracking largest and second-largest values
- palindrome checking
- anagram validation

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

## Problems Completed

| Day | Problem | Technique | Time | Space |
| --- | --- | --- | --- | --- |
| 01 | Largest Element | linear scan | O(n) | O(1) |
| 01 | Two Sum | hash map | O(n) | O(n) |
| 02 | Move Zeroes | two pointers / in-place swap | O(n) | O(1) |
| 02 | Second Largest | running first and second max | O(n) | O(1) |
| 03 | Valid Anagram | frequency map | O(n) | O(n) |
| 03 | Valid Palindrome | two pointers | O(n) | O(1) |

## How to Run

Compile all Java files into `out`:

```bash
javac -d out src/day01/*.java src/day02/*.java src/day03/*.java
```

Run any class with its package-qualified name:

```bash
java -cp out day01.LargestElement
java -cp out day01.TwoSum
java -cp out day02.MoveZeroes
java -cp out day02.SecondLargest
java -cp out day03.ValidAnagram
java -cp out day03.ValidPalindrome
```

## Notes

- Each file currently contains a `main` method for quick local testing.
- The focus is on simple, readable implementations before optimization-heavy versions.
- Some compiled `.class` files exist inside `src/`; keeping compiled output only in `out/` would make the repo cleaner.

## Next Additions

- string sliding window problems
- linked list basics
- recursion and backtracking practice
- a progress tracker for future days
