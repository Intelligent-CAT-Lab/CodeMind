<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
575

Expected output:
Ys

```
#import sys
#import numpy as np
import math
#from fractions import Fraction
import itertools
from collections import deque
from collections import Counter
#import heapq
from fractions  import gcd
#input=sys.stdin.readline
import bisect
n=int(input())
i=n//100
j=n%10
if i == j:
    print("Yes")
else:
    print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n / 100;
        int j = n % 10;
        if (i == j) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This is a basic Java program that reads an integer `n` from the standard input, calculates the quotient and remainder of `n` divided by 100, and then prints "Yes" if the quotient and remainder are equal, and "No" otherwise.

The program uses the `Scanner` class to read the input from the standard input, and the `Math` class to perform the division and modulo operations.

Note that the `import` statements are not necessary in Java, as the classes and methods are automatically imported when they are used.</s>
