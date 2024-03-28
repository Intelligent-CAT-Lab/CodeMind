
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] abc = new int[28];
        int[] num = new int[12];
        int abc_cnt = 0;
        int num_cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                abc[c - 'a' + 1]++;
                abc_cnt++;
            } else if (c >= '0' && c <= '9') {
                num[c - '0' + 1]++;
                num_cnt++;
            }
        }
        int ans = 0;
        while (abc_cnt > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc[current - 1] == 0 && abc[current] > 0) {
                    start = Math.min(start, current);
                }
                if (abc[current + 1] == 0 && abc[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    abc[current]--;
                    abc_cnt--;
                    break;
                }
                if (abc[current] > 0) {
                    abc[current]--;
                    abc_cnt--;
                }
                current++;
            }
        }
        while (num_cnt > 0) {
            int start = 100;
            int current = 1;
            while (current < 11) {
                if (num[current - 1] == 0 && num[current] > 0) {
                    start = Math.min(start, current);
                }
                if (num[current + 1] == 0 && num[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    num[current]--;
                    num_cnt--;
                    break;
                }
                if (num[current] > 0) {
                    num[current]--;
                    num_cnt--;
                }
                current++;
            }
        }
        System.out.println(ans);
    }
}
```

## 2. 
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int start = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                ans = Math.max(ans, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        ans = Math.max(ans, s.length() - start);
        return ans;
    }
}
```

## 3. 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

## 4. 
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```java
class Solution {
    public int firstUniqChar(String s) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (cnt[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 5. 
Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] cnt = new int[256];
        int start = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt[c]++;
            while (start < i && cnt[c] > 1) {
                cnt[s.charAt(start
