

```python
import java.util.*;

public class p01998 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n + 3];
        arr[0] = true;
        arr[1] = true;
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = 2; j * i < arr.length; j++) {
                    arr[i * j]  = true;
                }
                if (!arr[i] && !arr[i - 2]) {
                    count++;
                }
            }
        }
        System.out.println(count * 2);
    }
}

```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```python
class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        return s[::-1]
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```python
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s:
            return 0
        start = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in s[start:i]:
                start = s[start:i].index(s[i]) + start + 1
            max_len = max(max_len, i - start + 1)
        return max_len
```


```

## 2.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```python
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s:
            return 0
        start = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in s[start:i]:
                start = s[start:i].index(s[i]) + start + 1
            max_len = max(max_len, i - start + 1)
        return max_len
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```python
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s:
            return 0
        start = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in s[start:i]:
                start = s[start:i].index(s[i]) + start + 1
            max_len = max(max_len, i - start + 1)
        return max_len
```
/2017-03-06.md
# 2017-03-06

## 1.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
7

```
import java.util.*;

public class p01998 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n + 3];
        arr[0] = true;
        arr[1] = true;
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = 2; j * i < arr.length; j++) {
                    arr[i * j]  = true;
                }
                if (!arr[i] && !arr[i - 2]) {
                    count++;
                }
            }
        }
        System.out.println(count * 2);
    }
}


```

python code:

```python
import java.util.*;

public class p01998 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n + 3];
        arr[0] = true;
        arr[1] = true;
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = 2; j * i < arr.length; j++) {
                    arr[i * j]  = true;
                }
                if (!arr[i] && !arr[i - 2]) {
                    count++;
                }
            }
        }
        System.out.println(count * 2);
    }
}

```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```python
class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        return s[::-1]
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```python
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s:
            return 0
        start = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in s[start:i]:
                start = s[start:i].index(s[i]) + start + 1
            max_len =
