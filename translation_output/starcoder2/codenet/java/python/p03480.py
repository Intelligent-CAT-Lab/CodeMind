
```
s = input()
s += '2'
n = len(s)
ans = n - 1
for i in range(n - 1):
    if s[i] != s[i + 1]:
        tmp = max(i + 1, n - i - 2)
        ans = min(ans, tmp)
print(ans)
```/problems/p00001.md
# 1. Two Sum

## Description

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

## Example

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

## Solution

### Python

```python
class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
```

### Java

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

### C++

```cpp
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums[i] + nums[j] == target) {
                    return vector<int> {i, j};
                }
            }
        }
        throw invalid_argument("No two sum solution");
    }
};
```

### C

```c
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target) {
    for (int i = 0; i < numsSize; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                int* ret = (int*)malloc(sizeof(int) * 2);
                ret[0] = i;
                ret[1] = j;
                return ret;
            }
        }
    }
    return NULL;
}
```

### JavaScript

```javascript
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return [i, j];
            }
        }
    }
    throw new Error("No two sum solution");
};
```

### Ruby

```ruby
# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    for i in 0..nums.length - 1
        for j in i + 1..nums.length - 1
            if nums[i] + nums[j] == target
                return [i, j]
            end
        end
    end
    raise "No two sum solution"
end
```

### Swift

```swift
class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        for i in 0..<nums.count {
            for j in i + 1..<nums.count {
                if nums[i] + nums[j] == target {
                    return [i, j]
                }
            }
        }
        fatalError("No two sum solution")
    }
}
```

### Scala

```scala
object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        for (i <- 0 until nums.length) {
            for (j <- i + 1 until nums.length) {
                if (nums(i) + nums(j) == target) {
                    return Array(i, j)
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution")
    }
}
```

### Kotlin

```kotlin
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }
}
```

### Go

```go
func twoSum(nums []int, target int) []int {
    for i := 0; i < len(nums); i++ {
        for j := i + 1; j < len(nums); j++ {
            if nums[i] + nums[j] == target {
                return []int{i, j}
            }
        }
    }
    panic("No two sum solution")
}
```

### Rust

```rust
impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        for i in 0..nums.len() {
            for j in i + 1..nums.len() {
                if nums[i] + nums[j] == target {
                    return vec![i as i32, j as i32];
                }
            }
        }
        panic!("No two sum solution");
    }
}
```

### PHP

```php
class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target) {
        for ($i = 0; $i < count($nums); $i++) {
            for ($j = $i + 1; $j < count($nums); $j++) {
                if ($nums[$i] + $nums[$j] == $target) {
                    return [$i, $j];
                }
            }
        }
        throw new InvalidArgumentException("No two sum solution");
    }
}
```

### R

```r
twoSum <- function(nums, target) {
    for (i in 1:length(nums)) {
        for (j in (i + 1):length(nums)) {
            if (nums[i] + nums[j] == target) {
                return(c(i, j))
            }
        }
    }
    stop("No two sum solution")
}
```

### Haskell

```haskell
module Solution where

import Control.Exception (throw)
import Control.Monad (forM_)

twoSum :: [Int] -> Int -> [Int]
twoSum nums target =
    let
        loop i j =
            if i < length nums && j < length nums then
                if nums !! i + nums !! j == target then
                    [i, j]
                else
                    loop i (j + 1) `mplus` loop (i + 1) (j + 1)
            else
                mzero
    in
        loop 0 1 `mplus` throw (userError "No two sum solution")
```
