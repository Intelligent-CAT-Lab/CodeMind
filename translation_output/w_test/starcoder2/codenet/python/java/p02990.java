

```java

```
/docs/leetcode/0001-0050/0001-0010.md
## 1. Two Sum [$\star$](https://leetcode.com/problems/two-sum) :thumbsdown:

![](https://img.shields.io/badge/-Hash%20Table-7BA23F.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(n)$

```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lookup = {}
        for i, num in enumerate(nums):
            if target - num in lookup:
                return [lookup[target - num], i]
            lookup[num] = i
```

## 2. Add Two Numbers [$\star\star$](https://leetcode.com/problems/add-two-numbers) :thumbsup:

![](https://img.shields.io/badge/-Linked%20List-90B44B.svg?style=flat-square) ![](https://img.shields.io/badge/-Math-434343.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(1)$

```python
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode(0)
        curr = dummy
        carry = 0

        while l1 or l2 or carry:
            if l1:
                carry += l1.val
                l1 = l1.next
            if l2:
                carry += l2.val
                l2 = l2.next
            curr.next = ListNode(carry % 10)
            curr = curr.next
            carry //= 10

        return dummy.next
```

## 3. Longest Substring Without Repeating Characters [$\star\star$](https://leetcode.com/problems/longest-substring-without-repeating-characters) :thumbsup:

![](https://img.shields.io/badge/-Hash%20Table-7BA23F.svg?style=flat-square) ![](https://img.shields.io/badge/-Sliding%20Window-1E88A8.svg?style=flat-square) ![](https://img.shields.io/badge/-String-60373E.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(1)$

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        lookup = {}
        ans = 0
        j = 0

        for i, c in enumerate(s):
            if c in lookup:
                j = max(j, lookup[c] + 1)
            ans = max(ans, i - j + 1)
            lookup[c] = i

        return ans
```

## 4. Median of Two Sorted Arrays [$\star\star\star$](https://leetcode.com/problems/median-of-two-sorted-arrays) :thumbsup:

![](https://img.shields.io/badge/-Binary%20Search-1B813E.svg?style=flat-square)

- [x] Time: $O(\log(m + n))$
- [x] Space: $O(1)$

```python
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m, n = len(nums1), len(nums2)

        if m > n:
            nums1, nums2, m, n = nums2, nums1, n, m

        imin, imax = 0, m
        while imin <= imax:
            i = (imin + imax) // 2
            j = (m + n + 1) // 2 - i
            if i < m and nums2[j - 1] > nums1[i]:
                imin = i + 1
            elif i > 0 and nums1[i - 1] > nums2[j]:
                imax = i - 1
            else:
                if i == 0:
                    max_of_left = nums2[j - 1]
                elif j == 0:
                    max_of_left = nums1[i - 1]
                else:
                    max_of_left = max(nums1[i - 1], nums2[j - 1])

                if (m + n) % 2 == 1:
                    return max_of_left

                if i == m:
                    min_of_right = nums2[j]
                elif j == n:
                    min_of_right = nums1[i]
                else:
                    min_of_right = min(nums1[i], nums2[j])

                return (max_of_left + min_of_right) / 2
```

## 5. Longest Palindromic Substring [$\star\star$](https://leetcode.com/problems/longest-palindromic-substring) :thumbsup:

![](https://img.shields.io/badge/-Dynamic%20Programming-113285.svg?style=flat-square) ![](https://img.shields.io/badge/-String-60373E.svg?style=flat-square)

- [x] Time: $O(n^2)$
- [x] Space: $O(n^2)$

```python
class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        dp = [[False] * n for _ in range(n)]
        ans = ''

        for i in range(n - 1, -1, -1):
            for j in range(i, n):
                dp[i][j] = s[i] == s[j] and (j - i < 3 or dp[i + 1][j - 1])
                if dp[i][j] and j - i + 1 > len(ans):
                    ans = s[i:j + 1]

        return ans
```

## 6. ZigZag Conversion [$\star\star$](https://leetcode.com/problems/zigzag-conversion) :thumbsdown:

![](https://img.shields.io/badge/-String-60373E.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(n)$

```python
class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s

        ans = [''] * numRows
        i = 0
        step = 1

        for c in s:
            ans[i] += c
            if i == 0:
                step = 1
            elif i == numRows - 1:
                step = -1
            i += step

        return ''.join(ans)
```

## 7. Reverse Integer [$\star$](https://leetcode.com/problems/reverse-integer) :thumbsdown:

![](https://img.shields.io/badge/-Math-434343.svg?style=flat-square)

- [x] Time: $O(\log n)$
- [x] Space: $O(1)$

```python
class Solution:
    def reverse(self, x: int) -> int:
        ans = 0
