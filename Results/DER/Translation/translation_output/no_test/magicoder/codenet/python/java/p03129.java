<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```<｜end▁of▁sentence｜>
