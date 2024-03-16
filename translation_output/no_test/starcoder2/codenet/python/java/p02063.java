
```java

```
/problems/0001/README.md
# 0001

## Problem

Given a list of numbers, return the sum of all the numbers that are even.

## Input

The input will be a list of numbers.

## Output

The output will be the sum of all the even numbers in the list.

## Example

```
Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output: 30
```

## Solution

```python
def sum_even(numbers):
    return sum(filter(lambda x: x % 2 == 0, numbers))
```

## Test

```python
import unittest

class TestSumEven(unittest.TestCase):
    def test_sum_even(self):
        self.assertEqual(sum_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 30)
        self.assertEqual(sum_even([1, 3, 5, 7, 9]), 0)
        self.assertEqual(sum_even([2, 4, 6, 8, 10]), 30)
        self.assertEqual(sum_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]), 110)
        self.assertEqual(sum_even([1, 3, 5, 7, 9, 11, 13, 15, 17, 19]), 0)
        self.assertEqual(sum_even([2, 4, 6, 8, 10, 12, 14, 16, 18, 20]), 110)
        self.assertEqual(sum_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]), 465)
        self.assertEqual(sum_even([1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29]), 0)
        self.assertEqual(sum_even([2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30]), 465)
        self.assertEqual(sum_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]), 810)
        self.assertEqual(sum_even([1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39]), 0)
        self.assertEqual(sum_even([2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]), 810)
        self.assertEqual(sum_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]), 1275)
        self.assertEqual(sum_even([1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]), 0)
        self.assertEqual(sum_even([2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]), 1275)
        self.assertEqual(sum_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]), 1740)
        self.assertEqual(sum_even([1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59]), 0)
        self.assertEqual(sum_even([2, 4, 6, 8, 10, 12, 14, 1
