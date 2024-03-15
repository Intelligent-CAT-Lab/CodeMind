
```

```


```
/p00370.md
# 370. Additive Number

## Problem

Additive number is a string whose digits can form additive sequence.

A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

For example:
"112358" is an additive number because the digits can form an additive sequence: 1, 1, 2, 3, 5, 8.

1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
"199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
1 + 99 = 100, 99 + 100 = 199
Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.

Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.

Follow up:
How would you handle overflow for very large input integers?

## Solution

```python
class Solution(object):
    def isAdditiveNumber(self, num):
        """
        :type num: str
        :rtype: bool
        """
        def dfs(num, i, j, k, a, b):
            if i == j and j == k:
                return True
            if i == j:
                if num[j] == '0':
                    return dfs(num, j, k, k+1, b, 0)
                else:
                    return dfs(num, j, k, k+1, b, int(num[j:k]))
            if k == len(num):
                return False
            if num[i] == '0':
                return dfs(num, j, k, k+1, b, 0)
            if a + b == int(num[i:j]):
                return dfs(num, j, k, k+1, b, int(num[i:j]))
            return False

        for i in range(1, len(num)):
            for j in range(i+1, len(num)):
                if num[0] == '0' and i > 1:
                    continue
                if num[i] == '0' and j > i+1:
                    continue
                if dfs(num, 0, i, i+1, 0, int(num[0:i])):
                    return True
        return False
```/p00368.md
# 368. Largest Divisible Subset

## Problem

Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies: Si % Sj = 0 or Sj % Si = 0.

If there are multiple solutions, return any subset is fine.

Example 1:

nums: [1,2,3]

Result: [1,2] (of course, [1,3] will also be ok)
Example 2:

nums: [1,2,4,8]

Result: [1,2,4,8]

## Solution

```python
class Solution(object):
    def largestDivisibleSubset(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums:
            return []
        nums.sort()
        dp = [1] * len(nums)
        parent = [-1] * len(nums)
        for i in range(len(nums)):
            for j in range(i):
                if nums[i] % nums[j] == 0 and dp[j] + 1 > dp[i]:
                    dp[i] = dp[j] + 1
                    parent[i] = j
        max_index = dp.index(max(dp))
        res = []
        while max_index != -1:
            res.append(nums[max_index])
            max_index = parent[max_index]
        return res
```

## Solution 2

```python
class Solution(object):
    def largestDivisibleSubset(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums:
            return []
        nums.sort()
        dp = [1] * len(nums)
        parent = [-1] * len(nums)
        for i in range(len(nums)):
            for j in range(i):
                if nums[i] % nums[j] == 0 and dp[j] + 1 > dp[i]:
                    dp[i] = dp[j] + 1
                    parent[i] = j
        max_index = dp.index(max(dp))
        res = []
        while max_index != -1:
            res.append(nums[max_index])
            max_index = parent[max_index]
        return res
```

## Solution 3

```python
class Solution(object):
    def largestDivisibleSubset(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums:
            return []
        nums.sort()
        dp = [1] * len(nums)
        parent = [-1] * len(nums)
        for i in range(len(nums)):
            for j in range(i):
                if nums[i] % nums[j] == 0 and dp[j] + 1 > dp[i]:
                    dp[i] = dp[j] + 1
                    parent[i] = j
        max_index = dp.index(max(dp))
        res = []
        while max_index != -1:
            res.append(nums[max_index])
            max_index = parent[max_index]
        return res
```

## Solution 4

```python
class Solution(object):
    def largestDivisibleSubset(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums:
            return []
        nums.sort()
