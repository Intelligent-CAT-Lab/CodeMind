

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.substring(0, 1);
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.substring(index, index + 1);
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String pat) {
        int ans = 0;
        int index = 0;
        int num = 0;
        while (index < pat.length()) {
            if (pat.charAt(index) >= '0' && pat.charAt(index) <= '9') {
                num = num * 10 + pat.charAt(index) - '0';
            } else {
                ans += num;
                num = 0;
                if (pat.charAt(index) == '+') {
                    ans += num;
                    num = 0;
                }
            }
            index++;
        }
        ans += num;
        return ans;
    }
}
```


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] > a[k] && a[i] + a[k] > a[j] && a[j] + a[k] > a[i]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
/docs/leetcode/00611-valid-triangle-number.md
# 611. Valid Triangle Number (Medium)

Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

Example 1:

```
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
```

Note:

1. The length of the given array won't exceed 1000.
2. The integers in the given array are in the range of [0, 1000].

## 题意

给定一个数组，问有多少个三元组可以组成三角形。

## 题解

### 思路1

暴力枚举三元组，判断是否可以组成三角形。

```python
class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        ans = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                for k in range(j + 1, len(nums)):
                    if nums[i] + nums[j] > nums[k] and nums[i] + nums[k] > nums[j] and nums[j] + nums[k] > nums[i]:
                        ans += 1
        return ans
```

### 思路2

先排序，然后枚举前两个数，然后二分查找第三个数。

```python
class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                k = bisect.bisect_left(nums, nums[i] + nums[j])
                ans += max(0, k - j - 1)
        return ans
```

### 思路3

先排序，然后枚举前两个数，然后双指针查找第三个数。

```python
class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                k = j + 1
                l = len(nums) - 1
                while k < l:
                    if nums[i] + nums[j] > nums[k] and nums[i] + nums[j] > nums[l] and nums[k] + nums[l] > nums[i]:
                        ans += l - k
                        k += 1
                    else:
                        l -= 1
        return ans
```

### 思路4

先排序，然后枚举前两个数，然后双指针查找第三个数。

```python
class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                k = j + 1
                l = len(nums) - 1
                while k < l:
                    if nums[i] + nums[j] > nums[k] and nums[i] + nums[j] > nums[l] and nums[k] + nums[l] > nums[i]:
                        ans += l - k
                        k += 1
                    else:
                        l -= 1
        return ans
```

### 思路5

先排序，然后枚举前两个数，然后双指针查找第三个数。

```python
class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                k = j + 1
                l = len(nums) - 1
                while k < l:
                    if nums[i] + nums[j] > nums[k] and nums[i] + nums[j] > nums[l] and nums[k] + nums[l] > nums[i]:
                        ans += l - k
                        k += 1
                    else:
                        l -= 1
        return ans
```

### 思路6

先排序，然后枚举前两个数，然后双指针查找第三个数。

```python
class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                k = j + 1
                l = len(nums) - 1
                while k < l:
                    if nums[i] + nums[j] > nums[k] and nums[i] + nums[j] > nums[l] and nums[k] + nums[l] > nums[i]:
                        ans += l - k
                        k += 1
                    else:
                        l -= 1
        return ans
```

### 思路7

先排序，然后枚举前两个数，然后双指针查找第三个数。

```python
class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                k = j + 1
                l = len(nums) - 1
                while k
