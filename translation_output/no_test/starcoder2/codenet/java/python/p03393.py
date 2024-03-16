
```
import sys

def solve():
    set = set()
    for ch in range(ord('a'), ord('z') + 1):
        set.add(chr(ch))
    line = sys.stdin.readline().strip()
    for ch in line:
        set.remove(ch)
    if len(set) > 0:
        print(line + set.pop())
        return
    if line == "zyxwvutsrqponmlkjihgfedcba":
        print(-1)
        return
    next(line, "")

def next(line, cur):
    if line[:len(cur)] > cur:
        return False
    if len(line) == len(cur):
        if line < cur:
            print(cur)
            return True
        else:
            return False
    for ch in range(ord('a'), ord('z') + 1):
        if chr(ch) not in cur:
            if next(line, cur + chr(ch)):
                return True
    return False

solve()
```

## 03394 - 2018/04/26

### 题目

[题目链接](https://www.urionlinejudge.com.br/judge/en/problems/view/3394)

### 题意

给出一个字符串，求出一个字典序最小的字符串，使得这个字符串是给出的字符串的子序列。

### 思路

贪心，从前往后遍历，如果当前字符比后面的字符小，则保留当前字符，否则丢弃当前字符。

### 代码

java code:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

public class p03394 {
    final int _intMax = Integer.MAX_VALUE; // =2147483647>10^9
    final int _intMin = Integer.MIN_VALUE;
    final long _longMax = Long.MAX_VALUE; // =9223372036854775807L>10^18
    final long _longMin = Long.MIN_VALUE;

    void solve() {
        String line = readLine();
        StringBuilder sb = new StringBuilder
