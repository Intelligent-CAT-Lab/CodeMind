
```
import sys

def calc(s):
    def E(p):
        r = F(p)
        if not r[0]:
            return r
        while p < len(s) and (s[p] == '+' or s[p] == '-'):
            r2 = F(p + 1)
            if not r2[0]:
                return r2
            if s[p] == '+':
                r[1] += r2[1]
            else:
                r[1] -= r2[1]
            p = r2[2]
        return r

    def F(p):
        r = T(p)
        if not r[0]:
            return r
        while p < len(s) and s[p] == '*':
            r2 = T(p + 1)
            if not r2[0]:
                return r2
            r[1] *= r2[1]
            p = r2[2]
        return r

    def T(p):
        if s[p] == '(':
            r = E(p + 1)
            if not r[0] or s[r[2]] != ')':
                return [False, 0, 0]
            return [True, r[1], r[2] + 1]
        elif s[p] == '0' or s[p] == '1':
            r = [True, 0, p]
            for i in range(p, len(s)):
                if not s[i].isdigit():
                    break
                r[1] = r[1] * 2 + int(s[i])
                r[2] = i + 1
            return r
        else:
            return [False, 0, 0]

    return E(0)[1]

def dfs(i):
    op = ['0', '1', '+', '-', '*', '(', ')']
    if i == len(s):
        return calc(s)
    if s[i] == '.':
        for c in op:
            s[i] = c
            dfs(i + 1)
            s[i] = '.'
    else:
        dfs(i + 1)

s = list(input())
s.append('$')
print(dfs(0))
```

## 01543 - 1000000007

### 题目描述

给定一个长度为N的字符串S，求S的子串中有多少个是回文串。

### 输入格式

第一行一个整数N，表示字符串S的长度。

第二行一个长度为N的字符串S。

### 输出格式

一个整数，表示S的子串中有多少个是回文串。

### 样例输入

```
5
abcba
```

### 样例输出

```
15
```

### 数据范围

对于100%的数据，1≤N≤100000。

### 题解

```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01543{
    Scanner sc=new Scanner(System.in);

    int INF=1<<28;
    double EPS=1e-12;

    int n;
    char[] cs;

    void run(){
        n=sc.nextInt();
        cs=sc.next().toCharArray();
        solve();
    }

    void solve(){
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalindrome(i, j)){
                    ans++;
                }
            }
        }
        println(ans+"");

