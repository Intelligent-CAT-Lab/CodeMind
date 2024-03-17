

```java

```
/docs/leetcode/0001-0050/0001-0025/0018/README.md
# [18. 4Sum](https://leetcode-cn.com/problems/4sum/)

### 题目描述

<p>Given an array <code>nums</code> of <em>n</em> integers and an integer <code>target</code>, are there elements <em>a</em>, <em>b</em>, <em>c</em>, and <em>d</em> in <code>nums</code> such that <em>a</em> + <em>b</em> + <em>c</em> + <em>d</em> = <code>target</code>? Find all unique quadruplets in the array which gives the sum of <code>target</code>.</p>

<p><strong>Note:</strong></p>

<p>The solution set must not contain duplicate quadruplets.</p>

<p><strong>Example:</strong></p>

<pre>
Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
</pre>

### 相关话题
  [[数组](https://leetcode-cn.com/tag/array)]
  [[哈希表](https://leetcode-cn.com/tag/hash-table)]
  [[双指针](https://leetcode-cn.com/tag/two-pointers)]

### 相似题目
  1. [Two Sum](/problems/two-sum) (Easy)
  1. [3Sum](/problems/3sum) (Medium)
  1. [3Sum Closest](/problems/3sum-closest) (Medium)
  1. [4Sum II](/problems/4sum-ii) (Medium)

### 题解

```
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function(nums, target) {
  nums.sort((a, b) => a - b)
  const res = []
  for (let i = 0; i < nums.length - 3; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue
    for (let j = i + 1; j < nums.length - 2; j++) {
      if (j > i + 1 && nums[j] === nums[j - 1]) continue
      let left = j + 1
      let right = nums.length - 1
      while (left < right) {
        const sum = nums[i] + nums[j] + nums[left] + nums[right]
        if (sum === target) {
          res.push([nums[i], nums[j], nums[left], nums[right]])
          while (left < right && nums[left] === nums[left + 1]) left++
          while (left < right && nums[right] === nums[right - 1]) right--
          left++
          right--
        } else if (sum < target) {
          left++
        } else {
          right--
        }
      }
    }
  }
  return res
};
```

```
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> res;
        if (nums.size() < 4) return res;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size() - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.size() - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1, right = nums.size() - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.push_back({nums[i], nums[j], nums[left], nums[right]});
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
};
```

### 官方解题

#### 1. 排序 + 双指针

**思路**

我们可以先对数组进行排序，然后可以用和「[15. 三数之和](https://leetcode-cn.com/problems/3sum/)」类似的方法解决本题。

在遍历数组时，我们每遍历一个元素，在数组 $nums$ 的 $[i+1, n-1]$ 区间内，查找所有和为 $target-nums[i]$ 的元素对 $(nums[i], nums[j])$。可以用和「[15. 三数之和](https://leetcode-cn.com/problems/3sum/)」类似的方法解决。

**算法**

- 首先对数组进行排序，时间复杂度 $O(NlogN)$。

- 遍历数组：

  - 若 $nums[i]>target$：因为已经排序好，所以后面不可能有和为 $target$ 的数字组合，直接返回结果。

  - 若 $i>0$ 且 $nums[i]==nums[i-1]$： 出现重复，跳过。

  - 若 $nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target$：因为已经排序好，所以后面不可能有和为 $target$ 的数字组合，直接跳出循环。

  - 若 $nums[i]+nums[n-3]+nums[n-2]+nums[n-1]<target$：因为已经排序好，所以后面不可能有和为 $target$ 的数字组合，继续遍历下一个 $nums[i]$。

  - 再使用左右指针指向 $nums[i+1]$ 处，一边向右边逼近 $target-nums[i]$，一边向左逼近 $target-nums[i]$，若和等于 $target-nums[i]$，则将组成一个四元组，把四元组放到答案中，并且跳过左指针指向的数字，直到左指针指向不同的数字，跳过右指针指向的数字，直到右指针指向不同的数字。

```java
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
       
