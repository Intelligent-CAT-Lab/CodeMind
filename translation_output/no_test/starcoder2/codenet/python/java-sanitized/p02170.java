import java.util.*;
import java.io.*;

public class p02170 {
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