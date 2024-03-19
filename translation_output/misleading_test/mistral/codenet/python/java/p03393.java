<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
Y=cQd o.

```
import sys, re, os
from collections import deque, defaultdict, Counter
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians, acos, atan, asin
from itertools import permutations, combinations, product, accumulate
from operator import itemgetter, mul
from copy import deepcopy
from string import ascii_lowercase, ascii_uppercase, digits
from fractions import gcd
def input(): return sys.stdin.readline().strip()
def STR(): return input()
def INT(): return int(input())
def MAP(): return map(int, input().split())
def S_MAP(): return map(str, input().split())
def LIST(): return list(map(int, input().split()))
def S_LIST(): return list(map(str, input().split()))
sys.setrecursionlimit(10 ** 9)
inf = sys.maxsize
mod = 10 ** 9 + 7

s = STR()
if len(s) < 26:
    for i in range(26):
        tmp = chr(i + ord('a'))
        if not tmp in s:
            print(s + tmp)
            exit()
else:
    for i in reversed(range(26)):
        for j in range(ord(s[i]) + 1, ord('z') + 1):
            if not chr(j) in s[:i]:
                print(s[:i] + chr(j))
                exit()
    print(-1)
    exit()
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'a');
                if (!s.contains(c)) {
                    System.out.println(s + c);
                    return;
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (int j = ord(s.charAt(i)) + 1; j <= ord('z'); j++) {
                    char c = (char) j;
                    if (!s.substring(0, i).contains(c)) {
                        System.out.println(s.substring(0, i) + c);
                        return;
                    }
                }
            }
            System.out.println(-1);
            return;
        }
    }
}
```</s>
