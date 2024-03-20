
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(" ")) {
                System.out.print("101");
            } else if (s1[i].equals("'")) {
                System.out.print("000000");
            } else if (s1[i].equals(",")) {
                System.out.print("000011");
            } else if (s1[i].equals("-")) {
                System.out.print("10010001");
            } else if (s1[i].equals(".")) {
                System.out.print("010001");
            } else if (s1[i].equals("?")) {
                System.out.print("000001");
            } else if (s1[i].equals("A")) {
                System.out.print("100101");
            } else if (s1[i].equals("B")) {
                System.out.print("10011010");
            } else if (s1[i].equals("C")) {
                System.out.print("0101");
            } else if (s1[i].equals("D")) {
                System.out.print("0001");
            } else if (s1[i].equals("E")) {
                System.out.print("110");
            } else if (s1[i].equals("F")) {
                System.out.print("01001");
            } else if (s1[i].equals("G")) {
                System.out.print("10011011");
            } else if (s1[i].equals("H")) {
                System.out.print("010000");
            } else if (s1[i].equals("I")) {
                System.out.print("0111");
            } else if (s1[i].equals("J")) {
                System.out.print("10011000");
            } else if (s1[i].equals("K")) {
                System.out.print("0110");
            } else if (s1[i].equals("L")) {
                System.out.print("00100");
            } else if (s1[i].equals("M")) {
                System.out.print("10011001");
            } else if (s1[i].equals("N")) {
                System.out.print("10011110");
            } else if (s1[i].equals("O")) {
                System.out.print("00101");
            } else if (s1[i].equals("P")) {
                System.out.print("111");
            } else if (s1[i].equals("Q")) {
                System.out.print("10011111");
            } else if (s1[i].equals("R")) {
                System.out.print("1000");
            } else if (s1[i].equals("S")) {
                System.out.print("00110");
            } else if (s1[i].equals("T")) {
                System.out.print("00111");
            } else if (s1[i].equals("U")) {
                System.out.print("10011100");
            } else if (s1[i].equals("V")) {
                System.out.print("10011101");
            } else if (s1[i].equals("W")) {
                System.out.print("000010");
            } else if (s1[i].equals("X")) {
                System.out.print("10010010");
            } else if (s1[i].equals("Y")) {
                System.out.print("10010011");
            } else if (s1[i].equals("Z")) {
                System.out.print("10010000");
            }
        }
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max - min);
    }
}
```
/0001-0100/0001-0010/0009.md
# 0009

## 题目

Given an array of integers, find the difference between the largest and smallest values.

## 题目大意

给定一个整数数组，求最大值和最小值之差。

## 解答

```
#!/usr/bin/env python
# -*- coding: utf-8 -*-
from __future__ import (division, absolute_import, print_function,
                        unicode_literals)
from sys import stdin

n = int(stdin.readline())
a = [int(x) for x in stdin.readline().split()]
print(max(a) - min(a))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
