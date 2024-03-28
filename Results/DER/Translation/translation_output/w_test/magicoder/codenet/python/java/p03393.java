<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
atcoderb


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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (!s.contains(String.valueOf(tmp))) {
                    System.out.println(s + tmp);
                    return;
                }
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                for (int j = s.charAt(i) + 1; j <= 'z'; j++) {
                    if (!s.substring(0, i).contains(String.valueOf((char) j))) {
                        System.out.println(s.substring(0, i) + (char) j);
                        return;
                    }
                }
            }
            System.out.println(-1);
            return;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, checks if it contains all the letters of the alphabet, and if it doesn't, it appends the first letter that is not in the string to the end of the string. If the string is already long enough to contain all the letters of the alphabet, it checks if the last character of the string is the last letter of the alphabet, and if it isn't, it appends the next letter to the end of the string. If the last character of the string is the last letter of the alphabet, it prints -1.<｜end▁of▁sentence｜>
