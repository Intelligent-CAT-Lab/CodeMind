
```java

```
/2019-2020/01/C/README.md
# Problem C.

## Description

Given a string, find the length of the **longest substring** without repeating characters.

## Example

```
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
```

```
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

```
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## Solution

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
```


```

## Solution

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
```
/2019-2020/01/C/README.md
# Problem C.

## Description

Given a string, find the length of the **longest substring** without repeating characters.

## Example

```
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
```

```
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

```
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring./2019-2020/01/A/README.md
# Problem A.

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

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

## Explanation

We use a hash map to store the complement of each element.

For each element, we check if the complement exists in the hash map.

If it does, we return the indices of the two elements.

If it does not, we store the element in the hash map.

## Complexity Analysis

### Time complexity

The time complexity of this solution is O(n).

We traverse the array once and the hash map lookup takes constant time.

### Space complexity

The space complexity of this solution is O(n).

We use a hash map to store the complement of each element.

## Alternative Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
```

## Explanation

We use two nested loops to traverse the array.

For each element, we check if the complement exists in the array.

If it does, we return the indices of the two elements.

## Complexity Analysis

### Time complexity

The time complexity of this solution is O(n^2).

We traverse the array twice.

### Space complexity

The space complexity of this solution is O(1).

We do not use any additional space.

## Alternative Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
```

## Explanation

We use two nested loops to traverse the array.

For each element, we check if the complement exists in the array.

If it does, we return the indices of the two elements.

## Complexity Analysis

### Time complexity

The time complexity of this solution is O(n^2).

We traverse the array twice.

### Space complexity

The space complexity of this solution is O(1).

We do not use any additional space.

## Alternative Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
```

## Explanation

We use two nested loops to traverse the array.

For each element, we check if the complement exists in the array.

If it does, we return the indices of the two elements.

## Complexity Analysis

### Time complexity

The time complexity of this solution is O(n^2).

We traverse the array twice.

### Space complexity

The space complexity of this solution is O(1).

We do not use any additional space.

## Alternative Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
```

## Explanation

We use two nested loops to traverse the array.

For each element, we check if the complement exists in the array.
