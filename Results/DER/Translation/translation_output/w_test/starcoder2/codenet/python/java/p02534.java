

```java
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        String s = "";
        for(int i=0;i<k;i++){
            s+="ACL";
        }
        System.out.println(s);
    }
}
```
/content/posts/2020-09-20-python-to-java-1.md
---
template: post
title: Python to Java 1
slug: python-to-java-1
draft: false
date: 2020-09-20T12:00:00.000Z
description: >-
  This is the first post of a series of posts where I will be translating
  python code to java.
category: Python
tags:
  - Python
  - Java
---

This is the first post of a series of posts where I will be translating python code to java.

The code is taken from [AtCoder](https://atcoder.jp/contests/abc177/tasks/abc177_a)

The problem statement is as follows:

> Takahashi lives in a country with a grid-like road system. The country can be seen as an infinite grid of squares, and each square is identified by its coordinates (x,y), where x and y are integers.
>
> Takahashi lives at the square (0,0). He wants to go to the square (X,Y). He can move to a square with coordinates (x,y) if and only if |x|+|y|≤D, where |x| and |y| denote the absolute values of x and y, respectively.
>
> Find the minimum value of D such that Takahashi can go to the square (X,Y).
>
> Constraints
>
> * 1≤X,Y≤100
> * All values in input are integers.
>
> Input
>
> Input is given from Standard Input in the following format:
>
> X Y
>
> Output
>
> Print the minimum value of D such that Takahashi can go to the square (X,Y).
>
> Sample Input 1
>
> 3 2
>
> Sample Output 1
>
> 3
>
> Takahashi can go to the square (3,2) by moving to the squares (1,1), (2,0), and (3,2) in this order.
>
> Sample Input 2
>
> 1 1
>
> Sample Output 2
>
> 1
>
> Takahashi can go to the square (1,1) by moving to the square (1,1).
>
> Sample Input 3
>
> 100 100
>
> Sample Output 3
>
> 200
>
> Takahashi can go to the square (100,100) by moving to the square (100,100).

The python code is as follows:

```
def main():
    import sys
    input = sys.stdin.readline
    sys.setrecursionlimit(10**7)
    from collections import Counter, deque
    from collections import defaultdict
    from itertools import combinations, permutations, accumulate, groupby, product
    from bisect import bisect_left,bisect_right
    from heapq import heapify, heappop, heappush
    from math import floor, ceil,pi,factorial
    from operator import itemgetter
    def I(): return int(input())
    def MI(): return map(int, input().split())
    def LI(): return list(map(int, input().split()))
    def LI2(): return [int(input()) for i in range(n)]
    def MXI(): return [[LI()]for i in range(n)]
    def SI(): return input().rstrip()
    def printns(x): print('\n'.join(x))
    def printni(x): print('\n'.join(list(map(str,x))))
    inf = 10**17
    mod = 10**9 + 7
#main code here!
    x,y=MI()
    print(x+y)
    








if __name__=="__main__":
    main()
```

The java code is as follows:

```java
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        System.out.println(x+y);
    }
}
```
/content/posts/2020-09-20-python-to-java-2.md
---
template: post
title: Python to Java 2
slug: python-to-java-2
draft: false
date: 2020-09-20T12:00:00.000Z
description: >-
  This is the second post of a series of posts where I will be translating
  python code to java.
category: Python
tags:
  - Python
  - Java
---

This is the second post of a series of posts where I will be translating python code to java.

The code is taken from [AtCoder](https://atcoder.jp/contests/abc177/tasks/abc177_b)

The problem statement is as follows:

> You are given a string S of length N and a string T of length M.
>
> Find the number of occurrences of T as a substring in S.
>
> Constraints
>
> * 1≤N≤100
> * 1≤M≤100
> * S and T consist of lowercase English letters.
>
> Input
>
> Input is given from Standard Input in the following format:
>
> N M
> S
> T
>
> Output
>
> Print the number of occurrences of T as a substring in S.
>
> Sample Input 1
>
> 6 3
> atcoder
> cdr
>
> Sample Output 1
>
> 1
>
> Sample Input 2
>
> 10 10
> aaaaaaaaaa
> aaaaaaaaaa
>
> Sample Output 2
>
> 10
>
> Sample Input 3
>
> 10 10
> aaaaaaaaaa
> bbbbbbbbbb
>
> Sample Output 3
>
> 0

The python code is as follows:

```
def main():
    import sys
    input = sys.stdin.readline
    sys.setrecursionlimit(10**7)
    from collections import Counter, deque
    from collections import defaultdict
    from itertools import combinations, permutations, accumulate, groupby, product
    from bisect import bisect_left,bisect_right
    from heapq import heapify, heappop, heappush
    from math import floor, ceil,pi,factor
