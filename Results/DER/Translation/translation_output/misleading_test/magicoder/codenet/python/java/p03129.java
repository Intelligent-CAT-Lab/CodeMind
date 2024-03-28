<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1pt

```
# -*- coding: utf-8 -*-
 
import math
import itertools
import sys
import copy
 
# å¥å
#A, B, C, D = map(int, input().split())
#L = list(map(int, input().split()))
#S = list(str(input()))
#N = int(input())
N, K = map(int, input().split())

if N%2 == 0 :
  if N//2 >= K :
    print ("YES")
  else :
    print ("NO")
else :
  if N//2 + 1 >= K :
    print ("YES")
  else :
    print ("NO")
  

```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (N % 2 == 0) {
            if (N / 2 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (N / 2 + 1 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input (which is usually the console), and then checks if the first integer is divisible by 2. If it is, it checks if half of the first integer is greater than or equal to the second integer. If it is, it prints "YES". If it's not, it prints "NO". If the first integer is not divisible by 2, it checks if half of the first integer plus one is greater than or equal to the second integer. If it is, it prints "YES". If it's not, it prints "NO".<｜end▁of▁sentence｜>
