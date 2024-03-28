

```java

```
/docs/leetcode/0001-0050/0001-0025/0018/README.md
# [18. 4Sum](https://leetcode.com/problems/4sum/)

### 题目描述

Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

```
Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
```

### 解题思路

#### 双指针

- 先对数组进行排序
- 遍历数组，固定两个数，然后使用双指针，一个从前往后，一个从后往前
- 注意去重

```c++
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> ans;
        if(nums.size()<4) return ans;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-3;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.size()-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                int l=j+1,r=nums.size()-1;
                while(l<r){
                    int sum=nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        ans.push_back({nums[i],nums[j],nums[l],nums[r]});
                        while(l<r&&nums[l]==nums[l+1]) l++;
                        while(l<r&&nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    }else if(sum<target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return ans;
    }
};
```

#### 哈希表

- 先对数组进行排序
- 遍历数组，固定两个数，然后使用哈希表，将和为target-nums[i]-nums[j]的数存入哈希表
- 注意去重

```c++
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> ans;
        if(nums.size()<4) return ans;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-3;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.size()-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                unordered_map<int,int> m;
                for(int k=j+1;k<nums.size();k++){
                    if(m.count(target-nums[i]-nums[j]-nums[k])){
                        ans.push_back({nums[i],nums[j],nums[k],target-nums[i]-nums[j]-nums[k]});
                        while(k<nums.size()-1&&nums[k]==nums[k+1]) k++;
                    }
                    m[nums[k]]=k;
                }
            }
        }
        return ans;
    }
};
```

#### 哈希表+双指针

- 先对数组进行排序
- 遍历数组，固定两个数，然后使用哈希表，将和为target-nums[i]-nums[j]的数存入哈希表
- 然后使用双指针，一个从前往后，一个从后往前
- 注意去重

```c++
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> ans;
        if(nums.size()<4) return ans;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-3;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.size()-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                unordered_map<int,int> m;
                for(int k=j+1;k<nums.size();k++){
                    if(m.count(target-nums[i]-nums[j]-nums[k])){
                        ans.push_back({nums[i],nums[j],nums[k],target-nums[i]-nums[j]-nums[k]});
                        while(k<nums.size()-1&&nums[k]==nums[k+1]) k++;
                    }
                    m[nums[k]]=k;
                }
                for(int k=j+1;k<nums.size()-1;k++){
                    if(k>j+1&&nums[k]==nums[k-1]) continue;
                    int l=k+1,r=nums.size()-1;
                    while(l<r){
                        int sum=nums[i]+nums[j]+nums[l]+nums[r];
                        if(sum==target){
                            ans.push_back({nums[i],nums[j],nums[l],nums[r]});
                            while(l<r&&nums[l]==nums[l+1]) l++;
                            while(l<r&&nums[r]==nums[r-1]) r--;
                            l++;
                            r--;  }
        return ans;
    }
};
```

                        }else if(sum<target){
                            l++;
                        }else{
                            r--;
                        }
                    }
                }
            }
        }
        return ans;
    }
};
```

#### 哈希表+双指针+剪枝

- 先对数组进行排序
- 遍历数组，固定两个数，然后使用哈希表，将和为target-nums[i]-nums[j]的数存入哈希表
- 然后使用双指针，一个从前往后，一个从后往前
- 注意去重
- 剪枝，如果nums[i]+nums[j]+nums[l]+nums[r]>target，则break

```c++
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> ans;
        if(nums.size()<4) return ans;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-3;i++){
            if(i>0&&nums[i]==nums[
