
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] six = new int[7];
        int[] nine = new int[7];
        for(int i = 1; i < 8; i++){
            six[i-1] = (int)Math.pow(6, i);
            nine[i-1] = (int)Math.pow(9, i);
        }
        int count6 = 0;
        int count9 = 0;
        int tmp = N;
        for(int i = 6; i >= 0; i--){
            if(six[i] <= N){
                N -= six[i];
                count6 = 1;
                break;
            }
        }
        count6 += DP(N);
        N = tmp;
        if(N < 9){
            System.out.println(count6);
            return;
        }
        for(int i = 6; i >= 0; i--){
            if(nine[i] <= N){
                N -= nine[i];
                count9 = 1;
                break;
            }
        }
        count9 += DP(N);
        N = tmp;
        System.out.println(Math.min(count6, count9));
    }
    public static int DP(int n){
        if(n < 6){
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for(int i = 6; i >= 0; i--){
            if(six[i] <= n){
                n -= six[i];
                count6 = 1;
                break;
            }
        }
        count6 += DP(n);
        n = tmp;
        if(n < 9){
            return count6;
        }
        for(int i = 6; i >= 0; i--){
            if(nine[i] <= n){
                n -= nine[i];
                count9 = 1;
                break;
            }
        }
        count9 += DP(n);
        n = tmp;
        return Math.min(count6, count9);
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] str = s.toCharArray();
        int len = str.length;
        for(int i = 0; i < len/2; i++){
            char tmp = str[i];
            str[i] = str[len-i-1];
            str[len-i-1] = tmp;
        }
        return new String(str);
    }
}
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        int max = 1;
        int start = 0;
        int end = 0;
        int[] map = new int[256];
        for(int i = 0; i < len; i++){
            if(map[s.charAt(i)] == 0){
                map[s.charAt(i)] = 1;
                end++;
            }else{
                max = Math.max(max, end-start);
                while(s.charAt(start) != s.charAt(i)){
                    map[s.charAt(start)] = 0;
                    start++;
                }
                start++;
                end++;
            }
        }
        max = Math.max(max, end-start);
        return max;
    }
}
```

## 4.

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```java
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
```

## 5.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```java
public class Solution {
    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for(int i = 0; i < s.length(); i++){
            map[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(map[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
```

## 6.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int len = s.length();
        if(len == 0 || k == 0){
            return 0;
        }
        int max = 0;
        int start = 0;
        int end = 0;
        int[] map = new int[256];
        int count = 0;
        for(int i = 0; i < len; i++){
            if(map[s.charAt(i)] == 0){
                count++;
            }
            map[s.charAt(i)]++;
            end++;
            while(count > k){
                map[s.charAt(start)]--;
                if(map[s.charAt(start)] == 0){
                    count--;
                }
                start++;
            }
            max = Math.max(max, end-start);
        }
        return max;
    }
}
```

## 7.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that
