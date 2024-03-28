import java.util.*;
import java.io.*;

public class p02054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if ((A * B) % 2 == 0 && (B * C) % 2 == 0 && (C * A) % 2 == 0) {
            System.out.println("Tem");
        } else {
            System.out.println("Hom");
        }
    }
}

/content/posts/2020-04-20-python-code-to-java-code-2.md
---
title: Python code to Java code 2
date: 2020-04-20T15:00:00+08:00
draft: false
---

Translate the following python code to java and enclose your solution inside .
A sample test case is provided below:

Test input:
1 1 10

Expected output:
EHom


# -*- coding: utf-8 -*-
import sys
from operator import itemgetter
from fractions import gcd
from math import ceil, floor, sqrt
from copy import deepcopy
from collections import Counter, deque
import heapq
from functools import reduce
# local only
# if not __debug__:
#     fin = open('in_