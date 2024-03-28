

```java

```


```java

```
/java/0000-0099/0000-0009/0009.md
# 0009. Palindrome Number

## Problem

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true

Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Follow up:

Coud you solve it without converting the integer to a string?

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
121

Expected output:
true


```
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        if x == 0:
            return True
        if x % 10 == 0:
            return False
        rev = 0
        while x > rev:
            rev = rev * 10 + x % 10
            x = x // 10
        return x == rev or x == rev // 10

```/java/0000-0099/0000-0009/0008.md
# 0008. String to Integer (atoi)

## Problem

Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.

Example 1:

Input: "42"
Output: 42

Example 2:

Input: "   -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.

Example 3:

Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.

Example 4:

Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical 
             digit or a +/- sign. Therefore no valid conversion could be performed.

Example 5:

Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
"42"

Expected output:
42


```
class Solution:
    def myAtoi(self, str: str) -> int:
        str = str.strip()
        if not str:
            return 0
        sign = 1
        if str[0] == '-':
            sign = -1
            str = str[1:]
        elif str[0] == '+':
            str = str[1:]
        if not str:
            return 0
        ans = 0
        for c in str:
            if not c.isdigit():
                break
            ans = ans * 10 + int(c)
        ans *= sign
        if ans > 2**31 - 1:
            return 2**31 - 1
        if ans < -2**31:
            return -2**31
        return ans

```

java code:

```java

```
/java/0000-0099/0000-0009/0006.md
# 0006. ZigZag Conversion

## Problem

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
"PAYPALISHIRING"
3

Expected output:
"PAHNAPLSIIGYIR"


```
class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        ans = ["" for _ in range(numRows)]
        i = 0
        while i < len(s):
            for j in range(numRows):
                if i < len(s):
                    ans[j] += s[i]
                    i += 1
            for j in range(numRows-2, 0, -1):
                if i < len(s):
                    ans[j] += s[i]
                    i += 1
        return "".join(ans)

```

java code:

```java

```
/java/0000-0099/0000-0009/0007.md
# 0007. Reverse Integer

## Problem

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123

Expected output:
321


```
class Solution:
    def reverse(self, x: int) -> int:
        if x == 0:
            return 0
        sign = 1
        if x < 0:
            sign = -1
