

```python
import re

line = input()
line = re.sub(r'egg', 'e', line)
line = re.sub(r'chicken', 'c', line)
line = re.sub(r'ee', 'e e', line)
line = re.sub(r'ee', 'e e', line)
line = re.sub(r'cc', 'c c', line)
line = re.sub(r'cc', 'c c', line)
strs = line.split(' ')
max = 0
ans = ''
for i in range(len(strs)):
    if max < len(strs[i]):
        max = len(strs[i])
        ans = 'egg' if strs[i][max - 1] == 'e' else 'chicken'
print(ans)
```

## 1480. 最长回文子串

给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
示例 2：

输入: "cbbd"
输出: "bb"

```python
class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) == 0:
            return ''
        max_len = 1
        start = 0
        for i in range(len(s)):
            if i - max_len >= 1 and s[i - max_len - 1:i + 1] == s[i - max_len - 1:i + 1][::-1]:
                start = i - max_len - 1
                max_len += 2
                continue
            if i - max_len >= 0 and s[i - max_len:i + 1] == s[i - max_len:i + 1][::-1]:
                start = i - max_len
                max_len += 1
        return s[start:start + max_len]
```

## 1481. 不同整数的最少数目

给你一个整数数组 arr 和一个整数 k 。现需要从数组中恰好移除 k 个元素，请找出移除后数组中不同整数的最少数目。

示例 1：

输入：arr = [5,5,4], k = 1
输出：1
解释：移除 1 个 4 ，数组中只剩下 5 一种整数。
示例 2：

输入：arr = [4,3,1,1,3,3,2], k = 3
输出：2
解释：先移除 4、2 ，然后再移除两个 1 中的任意 1 个或者三个 3 中的任意 1 个，最后剩下 1 和 3 两种整数。

提示：

1 <= arr.length <= 10^5
1 <= arr[i] <= 10^9
0 <= k <= arr.length

```python
class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        d = {}
        for i in arr:
            if i not in d:
                d[i] = 1
            else:
                d[i] += 1
        d = sorted(d.items(), key=lambda x: x[1])
        for i in range(len(d)):
            if k >= d[i][1]:
                k -= d[i][1]
            else:
                return len(d) - i
        return 0
```

## 1482. 制作 m 束花所需的最少天数

给你一个整数数组 bloomDay，以及两个整数 m 和 k 。

现需要制作 m 束花。制作花束时，需要使用花园中 相邻的 k 朵花 。

花园中有 n 朵花，第 i 朵花会在 bloomDay[i] 时盛开，恰好 可以用于 一束 花中。

请你返回从花园中摘 m 束花需要等待的最少的天数。如果不能摘到 m 束花则返回 -1 。

示例 1：

输入：bloomDay = [1,10,3,10,2], m = 3, k = 1
输出：3
解释：让我们一起观察这三天的花开过程，x 表示花开，而 _ 表示花还未开。
现在需要制作 3 束花，每束只需要 1 朵。
1 天后：[x, _, _, _, _]   // 只能制作 1 束花
2 天后：[x, _, _, _, x]   // 只能制作 2 束花
3 天后：[x, _, x, _, x]   // 可以制作 3 束花，答案为 3
示例 2：

输入：bloomDay = [1,10,3,10,2], m = 3, k = 2
输出：-1
解释：要制作 3 束花，每束需要 2 朵花，也就是一共需要 6 朵花。而花园中只有 5 朵花，无法满足制作要求，返回 -1 。
示例 3：

输入：bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
输出：12
解释：要制作 2 束花，每束需要 3 朵。
花园在 7 天后和 12 天后的情况如下：
7 天后：[x, x, x, x, _, x, x]
可以用前 3 朵盛开的花制作第一束花。但不能使用后 3 朵盛开的花，因为它们不相邻。
12 天后：[x, x, x, x, x, x, x]
显然，我们可以用不同的方式制作两束花。
示例 4：

输入：bloomDay = [1000000000,1000000000], m = 1, k = 1
输出：1000000000
解释：需要等 1000000000 天才能采到花来制作花束
示例 5：

输入：bloomDay = [1,10,2,9,3,8,4,7,5,6], m = 4, k = 2
输出：9

提示：

bloomDay.length == n
1 <= n <= 10^5
1 <= bloomDay[i] <= 10^9
1 <= m <= 10^6
1 <= k <= n

```python
class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        if m * k > len(bloomDay):
            return -1
        left = 1
        right = max(bloomDay)
        while left < right:
            mid = (left + right) // 2
            if self.check(bloomDay, mid, m, k):
                right = mid
            else:
                left = mid + 1
        return left

    def check(self, bloomDay, day, m, k
