
```
class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        c = 0
        for i in range(len(s)):
            if s[i] in 'aeiouAEIOU':
                if i < len(s) // 2:
                    c += 1
                else:
                    c -= 1
        return c == 0

```
  }
}

```

python code:
```
class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        ans = 0
        for x in arr1:
            for y in arr2:
                if abs(x - y) <= d:
                    break
            else:
                ans += 1
        return ans

```
/leetcode/1385. Find the Distance Value Between Two Arrays.md
# 1385. Find the Distance Value Between Two Arrays

Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.

 

Example 1:
```
Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
Output: 2
Explanation: 
For arr1[0]=4 we have: 
|4-10|=6 > d=2 
|4-9|=5 > d=2 
|4-1|=3 > d=2 
|4-8|=4 > d=2 
For arr1[1]=5 we have: 
|5-10|=5 > d=2 
|5-9|=4 > d=2 
|5-1|=4 > d=2 
|5-8|=3 > d=2
For arr1[2]=8 we have:
|8-10|=2 <= d=2
|8-9|=1 <= d=2
|8-1|=7 > d=2
|8-8|=0 <= d=2
```
Example 2:
```
Input: arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
Output: 2
```
Example 3:
```
Input: arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
Output: 1
```

Constraints:

1 <= arr1.length, arr2.length <= 500
-10^3 <= arr1[i], arr2[j] <= 10^3
0 <= d <= 100

## 题目大意

给定两个数组，求两个数组中距离大于d的元素的个数。

## 解题思路

直接模拟即可。

## 代码

java code:
```
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for (int x : arr1) {
            boolean ok = true;
            for (int y : arr2) {
                if (Math.abs(x - y) <= d) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                ans++;
            }
        }
        return ans;
  /leetcode/1399. Count Largest Group.md
# 1399. Count Largest Group

Given an integer n. Each number from 1 to n is grouped according to the sum of its digits. 

Return how many groups have the largest size.

 

Example 1:
```
Input: n = 13
Output: 4
Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]. There are 4 groups with largest size.
```
Example 2:
```
Input: n = 2
Output: 2
Explanation: There are 2 groups [1], [2] of size 1.
```
Example 3:
```
Input: n = 15
Output: 6
```
Example 4:
```
Input: n = 24
Output: 5
```

Constraints:

- 1 <= n <= 10^4

## 题目大意

给定一个数字n，求1到n中，各个数字的各位数字之和相同的数字的个数。

## 解题思路

直接模拟即可。

## 代码

java code:
```
class Solution {
    public int countLargestGroup(int n) {
        int[] cnt = new int[37];
        for (int i = 1; i <= n; i++) {
            int sum =
