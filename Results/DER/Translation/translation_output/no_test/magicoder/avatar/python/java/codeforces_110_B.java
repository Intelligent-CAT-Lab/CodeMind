<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import defaultdict , deque
from functools import lru_cache
from heapq import heappush , heappop
from bisect import bisect_right , bisect_left
import math
hpop = heappop
hpush = heappush
MOD = 10 ** 9 + 7
def solution ( ) :
    n = int ( input ( ) )
    print ( " abcd " * ( n // 4 ) + " abc " [ : n % 4 ] )
def main ( ) :
    t = 1
    for _ in range ( t ) :
        solution ( )
import sys
import threading
sys . setrecursionlimit ( 1 << 30 )
threading . stack_size ( 1 << 27 )
thread = threading . Thread ( target = main )
thread . start ( ) ; thread . join ( )


```

@@ Response
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int MOD = (int)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        int t = 1;
        for (int i = 0; i < t; i++) {
            solution();
        }
    }

    static void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(String.join("", Collections.nCopies(n / 4, "abcd")) + "abc".substring(0, n % 4));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then prints a string that is a combination of "abcd" repeated a certain number of times and "abc" substring. The number of times "abcd" is repeated is `n / 4`, and the length of the "abc" substring is `n % 4`.<｜end▁of▁sentence｜>
