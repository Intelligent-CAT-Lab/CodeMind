<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5124

Expected output:
91

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
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static long N;
    static long MOD = (long)Math.pow(10, 9) + 7;
    static long INF = (long)Math.pow(10, 18);
    static StringBuilder S;

    static long func(int index, int cnt) {
        long ans = 0;
        if (index == 20) {
            if (cnt == 0) return 0;
            S = new StringBuilder(S.toString().replace("?", "9"));
            for (int i = 0; i < 20; i++) {
                if (S.charAt(i) != '?') continue;
                for (int j = 0; j < 10; j++) {
                    S.setCharAt(i, (char)(j + '0'));
                    if (Long.parseLong(S.toString()) > N) break;
                    else ans += (long)Math.pow(10, S.toString().replace("?", "").length());
                }
            }
            ans *= (cnt % 2 == 0 ? 1 : -1);
            return ans;
        }
        ans += func(index + 1, cnt);
        if (index <= 16) {
            S.setCharAt(index, '5');
            S.setCharAt(index + 1, '1');
            S.setCharAt(index + 3, '3');
            ans += func(index + 4, cnt + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        S = new StringBuilder("????????????????????");
        System.out.println(func(0, 0));
    }
}
```

This Java code does the same thing as the Python code. It recursively counts the number of valid 20-digit numbers that can be formed by replacing '?' with digits such that the number is less than or equal to N. The number '513' is inserted into the number at every possible position, and the count of valid numbers is increased by the number of '?'s in the number. The result is multiplied by -1 if the count of '513's is odd.
<|EOT|>
