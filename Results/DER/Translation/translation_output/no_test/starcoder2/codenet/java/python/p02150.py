
```
import sys

MOD = 1000000007

a, b, x = map(int, sys.stdin.readline().split())
s = a - b
count = max(x - a, 0) // s
total = (count % MOD) * (a % MOD) % MOD
x -= count * s
while x >= a:
    total += a
    x += - a + b
total += x
total %= MOD
print(total)
```

## 2151. 2017 ACM-ICPC Asia Regional Daejeon Online Preliminary Contest A - A+B

### Problem

Given two integers A and B, output A+B.

### Input

The first line contains an integer T (1 ≤ T ≤ 100), indicating the number of test cases.

For each test case, there are two integers A and B (0 ≤ A, B ≤ 10000).

### Output

For each test case, output A+B.

### Sample Input

```
3
1 2
10 20
100 200
```

### Sample Output

```
3
30
300
```

### Hint

No special judge.

### Solution

```python
import sys

T = int(sys.stdin.readline())
for _ in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(A + B)
```

## 2152. 2017 ACM-ICPC Asia Regional Daejeon Online Preliminary Contest B - B

### Problem

Given a string S, output the number of substrings of S that are palindromes.

### Input

The first line contains an integer T (1 ≤ T ≤ 100), indicating the number of test cases.

For each test case, there is a string S (1 ≤ |S| ≤ 100000).

### Output

For each test case, output the number of substrings of S that are palindromes.

### Sample Input

```
3
a
ab
aba
```

### Sample Output

```
1
3
6
```

### Hint

No special judge.

### Solution

```python
import sys

T = int(sys.stdin.readline())
for _ in range(T):
    S = sys.stdin.readline().strip()
    print(len(S) * (len(S) + 1) // 2)
```
/source/_posts/leetcode/leetcode-binary-search.md
---
title: LeetCode Binary Search
date: 2019-09-01 15:00:00
tags:
- LeetCode
- Binary Search
categories:
- LeetCode
---

## 34. Find First and Last Position of Element in Sorted Array

### Problem

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

### Example

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

### Solution

```python
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if not nums:
            return [-1, -1]
        left = self.search(nums, target, True)
        if left == len(nums) or nums[left] != target:
            return [-1, -1]
        return [left, self.search(nums, target, False) - 1]

    def search(self, nums, target, left):
        lo, hi = 0, len(nums)
        while lo < hi:
            mid = (lo + hi) // 2
            if nums[mid] > target or (left and nums[mid] == target):
                hi = mid
            else:
                lo = mid + 1
        return lo
```

## 35. Search Insert Position

### Problem

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

### Example

```
Input: [1,3,5,6], 5
Output: 2

Input: [1,3,5,6], 2
Output: 1

Input: [1,3,5,6], 7
Output: 4

Input: [1,3,5,6], 0
Output: 0
```

### Solution

```python
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        lo, hi = 0, len(nums)
        while lo < hi:
            mid = (lo + hi) // 2
            if nums[mid] >= target:
                hi = mid
            else:
                lo = mid + 1
        return lo
```

## 69. Sqrt(x)

### Problem

Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

### Example

```
Input: 4
Output: 2

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
```

### Solution

```python
class Solution:
    def mySqrt(self, x: int) -> int:
        lo, hi = 0, x
        while lo < hi:
            mid = (lo + hi + 1) // 2
            if mid * mid <= x:
                lo = mid
            else:
                hi = mid - 1
        return lo
```

## 74. Search a 2D Matrix

### Problem

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

### Example

```
Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false
```

### Solution

```python
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not matrix[0]:
            return False
        m, n = len(matrix), len(matrix[0])
        lo, hi = 0, m * n - 1
        while lo <= hi:
            mid = (lo + hi) // 2
            i, j = mid // n, mid % n
            if matrix[i][j] == target:
                return True
            elif matrix[i][j
