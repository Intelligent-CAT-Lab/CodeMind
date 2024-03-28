

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] ans = new String[2 ^ n - 1][2 ^ m - 1];
        for (int i = 0; i < 2 ^ n - 1; i++) {
            for (int j = 0; j < 2 ^ m - 1; j++) {
                ans[i][j] = "1";
            }
        }
        for (int k = 1; k < 11; k++) {
            for (int i = 2 ^ k; i < 2 ^ n; i += 2 ^ k) {
                for (int j = 2 ^ k; j < 2 ^ m; j += 2 ^ k) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }
        for (int i = 0; i < 2 ^ n - 1; i++) {
            for (int j = 0; j < 2 ^ m - 1; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
```
/docs/leetcode/0001-0100/0001-0010.md
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

![](https://img.shields.io/badge/-Hash%20Table-7BA23F.svg?style=flat-square) ![](https://img.shields.io/badge/-Sliding%20Window-1E88A8.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(1)$

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ans = 0
        lookup = {}

        for i, c in enumerate(s):
            if c in lookup:
                ans = max(ans, i - lookup[c])
            else:
                ans = max(ans, i + 1)
            lookup[c] = i

        return ans
```

## 4. Median of Two Sorted Arrays [$\star\star\star$](https://leetcode.com/problems/median-of-two-sorted-arrays) :thumbsup:

![](https://img.shields.io/badge/-Binary%20Search-1B813E.svg?style=flat-square)

- [x] Time: $O(\log\min(m, n))$
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
        ans = ''

        for i in range(len(s)):
            ans = max(self.expand(s, i, i), self.expand(s, i, i + 1), ans, key=len)

        return ans

    def expand(self, s: str, l: int, r: int) -> str:
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return s[l + 1:r]
```

## 6. ZigZag Conversion [$\star\star$](https://leetcode.com/problems/zigzag-conversion) :thumbsdown:

![](https://img.shields.io/badge/-String-60373E.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(n)$


