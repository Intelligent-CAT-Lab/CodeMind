System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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
            if S_[i]!= '?':
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int ans = 0;
        for (int i = 0; i < (1 << 20); i++) {
            String s = Integer.toBinaryString(i);
            while (s.length() < 20) {
                s = "0" + s;
            }
            String s2 = "";
            int cnt = 0;
            for (int j = 0; j < 20; j++) {
                if (s.charAt(j) == '0') {
                    s2 += "9";
                } else if (s.charAt(j) == '1') {
                    s2 += "5";
                    s2 += "1";
                    s2 += "3";
                    cnt++;
                } else {
                    s2 += "?";
                }
            }
            if (cnt % 2 == 0) {
                if (Long.parseLong(s2.replaceAll("\\\\?", "9")) <= Long.parseLong(N)) {
                    ans++;
                }
            } else {
                if (Long.parseLong(s2.replaceAll("\\\\?", "9")) > Long.parseLong(N)) {
                    ans--;
                }
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
