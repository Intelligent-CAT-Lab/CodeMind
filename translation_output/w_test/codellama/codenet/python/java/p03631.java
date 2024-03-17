<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
575

Expected output:
Yes


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

The `Scanner` class is used to read input from the standard input, and the `nextInt()` method is used to read an integer from the input. The `int` data type is used to store the input value.

The `if` statement is used to check if the quotient and remainder are equal, and the `System.out.println()` method is used to print the appropriate message.

Note that this program assumes that the input is a valid integer, and it does not handle any errors or exceptions that may occur during the input or calculation process.</s>
