<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] S = new int[20];
        for (int i = 0; i < 20; i++) {
            S[i] = -1;
        }
        System.out.println(func(S, 0, 0));
    }

    public static int func(int[] S, int index, int cnt) {
        int ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            for (int i = 0; i < 20; i++) {
                if (S[i]!= -1) {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S[i] = j;
                    if (Integer.parseInt(String.valueOf(S).replace("-1", "9")) > N) {
                        break;
                    } else {
                        ans += Math.pow(10, String.valueOf(S).replace("-1", "").length());
                    }
                }
            }
            ans *= Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            S[index] = 5;
            S[index + 1] = 1;
            S[index + 3] = 3;
            ans += func(S, index + 4, cnt + 1);
        }
        return ans;
    }
}
```
<|endoftext|>
