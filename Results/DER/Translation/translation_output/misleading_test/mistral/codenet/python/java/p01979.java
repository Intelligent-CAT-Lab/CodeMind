<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    final static int INF = (int) 1e18;
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[20];
        Arrays.fill(S, -1);
        int ans = func(S, 0, 0);
        System.out.println(ans);
    }

    public static int func(int[] S, int index, int cnt) {
        int ans = 0;
        if (index == 20) {
            if (cnt == 0)
                return 0;
            int[] S_ = Arrays.copyOf(S, 20);
            for (int i = 0; i < 20; i++) {
                if (S_[i] != -1)
                    continue;
                for (int j = 0; j < 10; j++) {
                    S_[i] = j;
                    if (isGreater(S_, 0, 20))
                        break;
                    else {
                        ans += (int) Math.pow(10, S_.length - S_.count('?'));
                    }
                }
            }
            ans *= (1 << (cnt + 1));
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            int[] S_ = Arrays.copyOf(S, 20);
            S_[index] = 5;
            S_[index + 1] = 1;
            S_[index + 3] = 3;
            ans += func(S_, index + 4, cnt + 1);
        }
        return ans;
    }

    public static boolean isGreater(int[] S, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += S[i];
        }
        return sum > N;
    }
}
```</s>
