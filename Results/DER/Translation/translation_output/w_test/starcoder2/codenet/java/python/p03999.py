

```python
s = input()
ans = 0
for dx in range(len(s)):
    for start in range(len(s)-dx):
        cur = int(s[start:start+dx+1])
        ans += cur*(helper(start)*helper(len(s)-dx-start-1))
print(ans)

def helper(n):
    if n == 0:
        return 1
    return 1<<(n-1)
```

## 4. 
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```python
def reverseString(s):
    return s[::-1]
```

## 5. 
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```python
def lengthOfLongestSubstring(s):
    if len(s) == 0:
        return 0
    if len(s) == 1:
        return 1
    max_len = 1
    for i in range(len(s)):
        for j in range(i+1, len(s)+1):
            if len(set(s[i:j])) == j-i:
                max_len = max(max_len, j-i)
    return max_len
```

## 6. 
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

```python
def isPalindrome(s):
    s = s.lower()
    s = ''.join(filter(str.isalnum, s))
    return s == s[::-1]
```

## 7. 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```python
def twoSum(nums, target):
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
```

## 8. 
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```python
def firstUniqChar(s):
    for i in range(len(s)):
        if s.count(s[i]) == 1:
            return i
    return -1
```

## 9. 
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```python
def lengthOfLongestSubstring(s):
    if len(s) == 0:
        return 0
    if len(s) == 1:
        return 1
    max_len = 1
    for i in range(len(s)):
        for j in range(i+1, len(s)+1):
            if len(set(s[i:j])) == j-i:
                max_len = max(max_len, j-i)
    return max_len
```

## 10. 
Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

```python
def lengthOfLongestSubstringTwoDistinct(s):
    if len(s) == 0:
        return 0
    if len(s) == 1:
        return 1
    max_len = 1
    for i in range(len(s)):
        for j in range(i+1, len(s)+1):
            if len(set(s[i:j])) <= 2:
                max_len = max(max_len, j-i)
    return max_len
```

## 11. 
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the empty string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.

```python
def minWindow(s, t):
    if len(s) == 0 or len(t) == 0:
        return ""
    if len(s) < len(t):
        return ""
    if len(s) == 1 and len(t) == 1:
        return s
    if len(s) == 1 and len(t) == 1 and s == t:
        return s
    if len(s) == 1 and len(t) == 1 and s != t:
        return ""
    if len(s) == len(t):
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 1:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 2:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 3:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 4:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 5:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 6:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 7:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 8:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 9:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t) + 10:
        if s == t:
            return s
        else:
            return ""
    if len(s) == len(t
