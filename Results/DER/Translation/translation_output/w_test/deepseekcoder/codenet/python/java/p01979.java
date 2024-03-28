<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5124

Expected output:
3


```
#!/usr/bin/env python

from collections import deque
import itertools as it
import sys
import math

sys.setrecursionlimit(1000000)

INF = 10 ** 18
MOD = 10 ** 9 + 7

N = input()

def func(S, index, cnt):
    ans = 0
    if index == 20:
        if cnt == 0:
            return 0
        S_ = list(S)
        for i in range(20):
            if S_[i] != '?':
                continue
            for j in range(10):
                S_[i] = str(j)
                if int(''.join(S_).replace('?', '9')) > N:
                    break
                else:
                    ans += 10 ** S_.count('?')
        ans *= (-1) ** (cnt + 1)
        return ans
    ans += func(S, index + 1, cnt)
    if index <= 16:
        S_ = list(S)
        S_[index] = '5'
        S_[index + 1] = '1'
        S_[index + 3] = '3'
        ans += func(S_, index + 4, cnt + 1)
    return ans

S = ['?'] * 20
print func(S, 0, 0)


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static long N;
    static long MOD = (long) Math.pow(10, 9) + 7;
    static long INF = (long) Math.pow(10, 18);

    static long func(String S, int index, int cnt) {
        long ans = 0;
        if (index == 20) {
            if (cnt == 0) return 0;
            char[] S_ = S.toCharArray();
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') continue;
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) (j + '0');
                    if (Long.parseLong(new String(S_).replace("?", "9")) > N) break;
                    else ans += (long) Math.pow(10, Arrays.toString(S_).length() - Arrays.toString(S_).replace("?", "").length());
                }
            }
            ans *= (cnt % 2 == 0 ? 1 : -1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = S.toCharArray();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(new String(S_), index + 4, cnt + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        String S = "???????????????????????";
        System.out.println(func(S, 0, 0));
    }
}
```

This Java code does the same thing as the Python code. It counts the number of valid 20-digit numbers that are less than or equal to N, where a valid number is a number that contains the substring "513" exactly once. The Python code uses recursion to solve this problem, and the Java code does the same thing. The main difference is that Java does not have a built-in function to replace a substring with another substring, so we use the `replace` method of the `String` class to achieve this.
<|EOT|>
