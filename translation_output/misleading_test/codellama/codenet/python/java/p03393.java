<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (!s.contains(String.valueOf(tmp))) {
                    System.out.println(s + tmp);
                    return;
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (int j = (int) s.charAt(i) + 1; j <= 'z'; j++) {
                    if (!s.substring(0, i).contains(String.valueOf((char) j))) {
                        System.out.println(s.substring(0, i) + (char) j);
                        return;
                    }
                }
            }
            System.out.println(-1);
        }
    }
}
```
This is a solution to the problem in Java. It uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The solution first checks if the length of the input string is less than 26, and if so, it iterates over the alphabet and checks if each letter is present in the input string. If a letter is not present, it prints the input string with the missing letter and returns.

If the length of the input string is greater than or equal to 26, the solution iterates over the input string in reverse order, and for each character, it checks if the next character in the alphabet is not present in the input string before the current character. If such a character is found, it prints the input string with the missing character and returns.

If no missing character is found, the solution prints -1 and returns.</s>
