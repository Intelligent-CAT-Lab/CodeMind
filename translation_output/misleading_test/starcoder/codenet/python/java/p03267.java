<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
3 4
1S 2 1
 2 0
2 3 2y
2k{Qe

```
# coding: utf-8
import sys

sr = lambda: sys.stdin.readline().rstrip()
ir = lambda: int(sr())
lr = lambda: list(map(int, sr().split()))

L = ir()
edges = []
length = L.bit_length()
for i in range(1, length):
    edges.append((i, i+1, 2**(i-1)))
    edges.append((i, i+1, 0))

# 2**(length-1)-1ã¾ã§ã®æ°ã¯å®äº
# Lã«è¿ãåãç«¯ããå¦çãã¦ãã
for i in range(length-1):
    if L >> i & 1:
        L -= 2 ** i
        edges.append((i+1, length, L))

print(length, len(edges))
for x in edges:
    print(*x)

```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        int[] dp3 = new int[n];
        int[] dp4 = new int[n];
        int[] dp5 = new int[n];
        int[] dp6 = new int[n];
        int[] dp7 = new int[n];
        int[] dp8 = new int[n];
        int[] dp9 = new int[n];
        int[] dp10 = new int[n];
        int[] dp11 = new int[n];
        int[] dp12 = new int[n];
        int[] dp13 = new int[n];
        int[] dp14 = new int[n];
        int[] dp15 = new int[n];
        int[] dp16 = new int[n];
        int[] dp17 = new int[n];
        int[] dp18 = new int[n];
        int[] dp19 = new int[n];
        int[] dp20 = new int[n];
        int[] dp21 = new int[n];
        int[] dp22 = new int[n];
        int[] dp23 = new int[n];
        int[] dp24 = new int[n];
        int[] dp25 = new int[n];
        int[] dp26 = new int[n];
        int[] dp27 = new int[n];
        int[] dp28 = new int[n];
        int[] dp29 = new int[n];
        int[] dp30 = new int[n];
        int[] dp31 = new int[n];
        int[] dp32 = new int[n];
        int[] dp33 = new int[n];
        int[] dp34 = new int[n];
        int[] dp35 = new int[n];
        int[] dp36 = new int[n];
        int[] dp37 = new int[n];
        int[] dp38 = new int[n];
        int[] dp39 = new int[n];
        int[] dp40 = new int[n];
        int[] dp41 = new int[n];
        int[] dp42 = new int[n];
        int[] dp43 = new int[n];
        int[] dp44 = new int[n];
        int[] dp45 = new int[n];
        int[] dp46 = new int[n];
        int[] dp47 = new int[n];
        int[] dp48 = new int[n];
        int[] dp49 = new int[n];
        int[] dp50 = new int[n];
        int[] dp51 = new int[n];
        int[] dp52 = new int[n];
        int[] dp53 = new int[n];
        int[] dp54 = new int[n];
        int[] dp55 = new int[n];
        int[] dp56 = new int[n];
        int[] dp57 = new int[n];
        int[] dp58 = new int[n];
        int[] dp59 = new int[n];
        int[] dp60 = new int[n];
        int[] dp61 = new int[n];
        int[] dp62 = new int[n];
        int[] dp63 = new int[n];
        int[] dp64 = new int[n];
        int[] dp65 = new int[n];
        int[] dp66 = new int[n];
        int[] dp67 = new int[n];
        int[] dp68 = new int[n];
        int[] dp69 = new int[n];
        int[] dp70 = new int[n];
        int[] dp71 = new int[n];
        int[] dp72 = new int[n];
        int[] dp73 = new int[n];
        int[] dp74 = new int[n];
        int[] dp75 = new int[n];
        int[] dp76 = new int[n];
        int[] dp77 = new int[n];
        int[] dp78 = new int[n];
        int[] dp79 = new int[n];
        int[] dp80 = new int[n];
        int[] dp81 = new int[n];
        int[] dp82 = new int[n];
        int[] dp83 = new int[n];
        int[] dp84 = new int[n];
        int[] dp85 = new int[n];
        int[] dp86 = new int[n];
        int[] dp87 = new int[n];
        int[] dp88 = new int[n];
        int[] dp89 = new int[n];
        int[] dp90 = new int[n];
        int[] dp91 = new int[n];
        int[] dp92 = new int[n];
        int[] dp93 = new int[n];
        int[] dp94 = new int[n];
        int[] dp95 = new int[n];
        int[] dp96 = new int[n];
        int[] dp97 = new int[n];
        int[] dp98 = new int[n];
        int[] dp99 = new int[n];
        int[] dp100 = new int[n];
        int[] dp101 = new int[n];
        int[] dp102 = new int[n];
        int[] dp103 = new int[n];
        int[] dp104 = new int[n];
        int[] dp105 = new int[n];
        int[] dp106 = new int[n];
        int[] dp107 = new int[n];
        int[] dp108 = new int[n];
        int[] dp109 = new int[n];
        int[] dp110 = new int[n];
        int[] dp111 = new int[n];
        int[] dp112 = new int[n];
        int[] dp113 = new int[n];
        int[] dp114 = new int[n];
        int[] dp115 = new int[n];
        int[] dp116 = new int[n];
        int[] dp117 = new int[n];
        int[] dp118 = new int[n];
        int[] dp119 = new int[n];
        int[] dp120 = new int[n];
        int[] dp121 = new int[n];
        int[] dp122 = new int[n];
        int[] dp123 = new int[n];
        int[] dp124 = new int[n];
        int[] dp125 = new int[n];
        int[] dp126 = new int[n];
        int[] dp127 = new int[n];
        int[] dp128 = new int[n];
        int[] dp129 = new int[n];
        int[] dp130 = new int[n];
        int[] dp131 = new int[n];
        int
