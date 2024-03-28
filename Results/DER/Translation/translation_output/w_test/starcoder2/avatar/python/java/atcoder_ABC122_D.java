

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
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
    }
}
```

### 官方解题

#### 思路一：暴力枚举

**思路**

最容易想到的方法是枚举所有的四元组，然后判断它们是否能构成目标和。

**算法**

首先对数组进行排序，然后我们可以用四个指针 a, b, c, d 来表示四个元素，一开始，a 指向第一个元素，b 指向 a 后面一个元素，c 和 d 分别指向最后两个元素，然后我们计算四个元素的和，如果和等于目标值，我们将这四个元素加入答案中，然后我们需要去重，因为在枚举的过程中可能会出现重复的四元组，然后我们需要跳过重复的元素，具体来说，就是如果当前的元素和前一个元素相同，我们就跳过当前这个元素，然后我们再判断当前的和是大于还是小于目标值，因为数组是有序的，如果当前的和大于目标值，我们可以将 d 向左移动一个位置，如果当前的和小于目标值，我们可以将 c 向右移动一个位置，然后我们按照这样的思路遍历整个数组，就可以找到所有的四元组了。

```C++ [sol1-C++]
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> ans;
        int n = nums.size();
        if (n < 4) return ans;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < n - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if (nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) continue;
            for (int j = i + 1; j < n - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) continue;
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        ans.push_back({nums[i], nums[j], nums[left], nums[right]});
                        while (left < right && nums[left] == nums[left + 1]) ++left;
                        while (left < right && nums[right] == nums[right - 1]) --right;
                        ++left; --right;
                    } else if (sum < target) ++left;
                    else --right;
                }
            }
        }
        return ans;
    }
};
```

```Java [sol1-Java]
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if (nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) continue;
            for (int j = i + 1; j < n - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) continue;
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) ++left;
                        while (left < right && nums[right] == nums[right - 1]) --right;
                        ++left; --right;
                    } else if (sum < target) ++left;
                    else --right;
                }
            }
        }
        return ans;
    }
}
```

```Python [sol1-Python3]
class Solution:
    def fourSum(self
