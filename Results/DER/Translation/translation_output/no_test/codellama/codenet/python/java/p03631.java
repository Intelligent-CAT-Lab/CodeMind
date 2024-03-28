<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
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
This is the Java code equivalent to the Python code you provided. It uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `if` statement is used to check if the two digits are the same, and the `System.out.println()` method is used to print the result.</s>
