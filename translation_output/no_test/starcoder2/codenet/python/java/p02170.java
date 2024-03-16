
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 998244353;
    static int n,k,a;
    static int[] lst;
    static int A;
    static int inv;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = sc.nextInt();
        lst = new int[k+1];
        lst[k-1] = 1;
        A = a*pow(100*n,mod-2,mod);
        inv = pow(n,mod-2,mod);
        for(int i = k-2;i>=0;i--){
            if(k > i + n){
                lst[i] = A*(lst[i+1] - lst[i+n+1]) + lst[i+1];
                lst[i] %= mod;
            }else{
                lst[i] = A*(lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1];
                lst[i] %= mod;
            }
        }
        System.out.println((lst[0] - lst[1])%mod);
    }
    static int pow(int a,int b,int mod){
        int res = 1;
        while(b > 0){
            if((b&1) == 1){
                res = res*a%mod;
            }
            a = a*a%mod;
            b >>= 1;
        }
        return res;
    }
}
```

# 总结

这道题的思路是很简单的，但是实现起来还是有点麻烦的，主要是因为python的语法和java的语法不一样，所以在实现的时候还是有点麻烦的。

# 参考

[官方题解](https://atcoder.jp/contests/abc189/editorial)

---
title: Atcoder abc190 题解
author: 张权
top: false
cover: false
toc: true
mathjax: true
date: 2021-02-14 16:00:00
password:
summary: Atcoder abc190 题解
tags:
    - Atcoder
    - 题解
categories: Atcoder
---

# A

## 题目

> 题目链接：[Atcoder abc190 A](https://atcoder.jp/contests/abc190/tasks/abc190_a)
>
> 题目标题：A - B or C
>
> 题目大意：给出三个整数$A,B,C$，如果$A>B$，输出$A$，否则输出$C$

## 题解

这道题的题目很简单，直接判断$A>B$即可。

## 代码

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(c);
        }
    }
}
```

# B

## 题目

> 题目链接：[Atcoder abc190 B](https://atcoder.jp/contests/abc190/tasks/abc190_b)
>
> 题目标题：B - Magic 3
>
> 题目大意：给出$N$个点，每个点有两个属性$X,Y$，如果$X>0$且$Y<X$，则称这个点为魔法点，问是否存在$K$个魔法点。

## 题解

这道题的题目也很简单，直接判断即可。

## 代码

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x > 0 && y < x){
                cnt++;
            }
        }
        if(cnt >= k){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
```

# C

## 题目

> 题目链接：[Atcoder abc190 C](https://atcoder.jp/contests/abc190/tasks/abc190_c)
>
> 题目标题：C - Bowls and Dishes
>
> 题目大意：给出$N$个碗和$M$个盘子，每个盘子有两个属性$A,B$，表示这个盘子可以装在碗$A$和碗$B$中，现在有$Q$个询问，每个询问给出$C,D$，表示将碗$C$中的盘子拿到碗$D$中，问最多能装多少个盘子。

## 题解

这道题的题目也很简单，直接模拟即可。

## 代码

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] dishes = new int[m][2];
        for(int i = 0;i<m;i++){
            dishes[i][0] = sc.nextInt();
            dishes[i][1] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[][] query = new int[q][2];
        for(int i = 0;i<q;i++){
            query[i][0] = sc.nextInt();
            query[i][1] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0;i<(1<<q);i++){
            int[] cnt = new int[n+1];
            for(int j = 0;j<q;j++){
                if((i&(1<<j)) != 0){
                    cnt[query[j][0]]++;
                    cnt[query[j][1]]--;
                }
            }
            int tmp = 0;
           
