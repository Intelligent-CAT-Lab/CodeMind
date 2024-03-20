
```java

```
/2019/01/01/2019-01-01-1.md
# 2019-01-01-1

## 1. 题目

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

## 2. 解题思路

### 2.1 思路1

暴力法，两层循环，时间复杂度O(n^2)，空间复杂度O(1)

### 2.2 思路2

使用map，遍历数组，将数组元素作为key，数组下标作为value，时间复杂度O(n)，空间复杂度O(n)

## 3. 代码

### 3.1 思路1

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
```

### 3.2 思路2

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

## 4. 总结

### 4.1 思路1

暴力法，两层循环，时间复杂度O(n^2)，空间复杂度O(1)

### 4.2 思路2

使用map，遍历数组，将数组元素作为key，数组下标作为value，时间复杂度O(n)，空间复杂度O(n)

## 5. 参考

[1] https://leetcode-cn.com/problems/two-sum/

[2] https://leetcode.com/problems/two-sum/

[3] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[4] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[5] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[6] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[7] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[8] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[9] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[10] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[11] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[12] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[13] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[14] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[15] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[16] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[17] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[18] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[19] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[20] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[21] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[22] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[23] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[24] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[25] https://leetcode.com/problems/two-sum/discuss/17/Here-is-a-Python-solution-in-O(n)-time

[26] https://leetcode.
