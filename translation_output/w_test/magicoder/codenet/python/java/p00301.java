<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
+0-+


```
import heapq
from collections import deque
from enum import Enum
import sys
import math
from _heapq import heappush, heappop
import copy

BIG_NUM = 2000000000
HUGE_NUM = 99999999999999999
MOD = 1000000007
EPS = 0.000000001

sys.setrecursionlimit(3**12)

SIZE = 15

POW = [1]*SIZE
for i in range(1,SIZE):
    POW[i] = POW[i-1]*3

W = int(input())

max_digit = None
for i in range(SIZE):
    if (POW[i]-1)//2 >= W:
        max_digit = i
        break

ans =  [None]*(max_digit+1)
work = [None]*(max_digit+1)

def recursive(digit,tmp_sum):
    global ans,work,W,max_digit
    if digit == -1:
        if tmp_sum == W:
            for i in range(max_digit,-1,-1):
                ans[i] = work[i]
        return
    work[digit] = '0'
    recursive(digit-1,tmp_sum)
    work[digit] = '+'
    recursive(digit-1,tmp_sum+POW[digit])
    if tmp_sum > 0:
        work[digit] = '-'
        recursive(digit-1,tmp_sum-POW[digit])

recursive(max_digit,0)

is_First = True
for i in range(max_digit,-1,-1):
    if ans[i] == '0':
        if is_First:
            continue
        else:
            print("0",end="")
    elif ans[i] == '+':
        is_First = False
        print("+",end="")
    else: #ans[i] == '-'
        is_First = False
        print("-",end="")
print()



```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static int SIZE = 15;
    static long[] POW = new long[SIZE];
    static String[] ans = new String[SIZE];
    static String[] work = new String[SIZE];
    static boolean isFirst = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long W = scanner.nextLong();

        for (int i = 0; i < SIZE; i++) {
            POW[i] = (long) Math.pow(3, i);
        }

        int maxDigit = -1;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                maxDigit = i;
                break;
            }
        }

        recursive(maxDigit, 0);

        for (int i = maxDigit; i >= 0; i--) {
            if (ans[i].equals("0")) {
                if (isFirst) {
                    continue;
                } else {
                    System.out.print("0");
                }
            } else if (ans[i].equals("+")) {
                isFirst = false;
                System.out.print("+");
            } else { // ans[i].equals("-")
                isFirst = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }

    static void recursive(int digit, long tmpSum) {
        if (digit == -1) {
            if (tmpSum == 0) {
                for (int i = 0; i <= digit; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = "0";
        recursive(digit - 1, tmpSum);
        work[digit] = "+";
        recursive(digit - 1, tmpSum + POW[digit]);
        if (tmpSum > 0) {
            work[digit] = "-";
            recursive(digit - 1, tmpSum - POW[digit]);
        }
    }
}
```

Please note that Java does not support negative indexing for arrays, so the loop in the `main` method has been adjusted accordingly. Also, the `print` function in Java does not have an `end` parameter like Python's `print` function, so the output is printed on a new line by default.<｜end▁of▁sentence｜>
