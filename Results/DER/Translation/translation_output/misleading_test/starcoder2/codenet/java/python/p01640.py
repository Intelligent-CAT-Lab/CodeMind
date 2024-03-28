

```python
import sys

w, h, gx, gy, n = map(int, sys.stdin.readline().split())
gx -= 1
gy -= 1
xs = []
ys = []
for i in range(n):
    x, y = map(int, sys.stdin.readline().split())
    xs.append(x - 1)
    ys.append(y - 1)
run = sys.stdin.readline().strip()

def solve():
    sum = 0
    for d in range(4):
        sum += solve1()
        ngx = h - 1 - gy
        ngy = gx
        gx = ngx
        gy = ngy
        for i in range(n):
            nx = h - 1 - ys[i]
            ny = xs[i]
            xs[i] = nx
            ys[i] = ny
        t = w
        w = h
        h = t
    print(sum)

def solve1():
    sets1 = [set() for i in range(w)]
    for i in range(w):
        sets1[i].add(-1)
        sets1[i].add(h)
    sets2 = [set() for i in range(h)]
    for i in range(h):
        sets2[i].add(-1)
        sets2[i].add(w)
    for i in range(n):
        sets1[xs[i]].add(ys[i])
        sets2[ys[i]].add(xs[i])
    sets1[gx].add(gy)
    sets2[gy].add(gx)
    sum = 1
    for x in range(w):
        py = -2
        for y in sorted(sets1[x]):
            sy = y - 1
            if sy != py:
                if ok(x, sy, 0):
                    sum += y - py - 1
            py = y
    return sum

def ok(x, y, d):
    for k in range(len(run)):
        wx, wy, nx, ny = 0, 0, 0, 0
        if d == 0:
            wx = nx = x
            wy = max(sets1[x])
            ny = wy - 1
        elif d == 1:
            wy = ny = y
            wx = min(sets2[y])
            nx = wx + 1
        elif d == 2:
            wx = nx = x
            wy = min(sets2[x])
            ny = wy + 1
        else:
            wy = ny = y
            wx = max(sets1[y])
            nx = wx - 1
        if wx == gx and wy == gy:
            return True
        x = nx
        y = ny
        if run[k] == 'L':
            d = (d + 3) % 4
        elif run[k] == 'R':
            d = (d + 1) % 4
    return False

solve()
```

## 01641 - 
### 题目大意
给出一个$n$个点$m$条边的无向图，求出图中所有长度为$k$的简单环的个数。

### 解题思路

### 代码

```java
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// 
public class p01641{
    Scanner sc=new Scanner(System.in);

    int n, m, k;
    int[] from, to;
    int[][] g;

    void run(){
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        from=new int[m];
        to=new int[m];
        for(int i=0; i<m; i++){
            from[i]=sc.nextInt()-1;
            to[i]=sc.nextInt()-1;
        
