<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

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
Explanation:

* The code first prompts the user to enter two integers `N` and `K`.
* It then checks if `N` is even or odd using the modulo operator `%`.
* If `N` is even, it checks if `N / 2` is greater than or equal to `K`. If it is, it prints "YES", otherwise it prints "NO".
* If `N` is odd, it checks if `N / 2 + 1` is greater than or equal to `K`. If it is, it prints "YES", otherwise it prints "NO".

Note: The code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console.</s>
