
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            int tmp = k * 7;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                if (tmp / 10 % 10 <= 7) {
                    int num = 7 - tmp / 10 % 10;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                } else if (tmp / 10 % 10 == 8) {
                    int num = 9;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                } else if (tmp / 10 % 10 == 9) {
                    int num = 8;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                }
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            int tmp = k * 9;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 3 - 1) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            int tmp = k * 1;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 7 + 1) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            int tmp = k * 3;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) + 3) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
```
/2020/09/20200901.md
# 20200901

## 1. 题目

### 1.1. 题目1

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例:

```
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```

### 1.2. 题目2

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例:

```
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```

## 2. 解题思路

### 2.1. 解题思路1

#### 2.1.1. 思路

使用哈希表，遍历数组并将数组元素的值和索引添加到表中，然后再次遍历数组，寻找目标元素，如果找到，则返回索引。

#### 2.1.2. 复杂度分析

- 时间复杂度：O(n)
- 空间复杂度：O(n)

#### 2.1.3. 代码

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for
