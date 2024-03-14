<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int W;
    static int SIZE = 15;
    static int[] POW = new int[SIZE];
    static String[] ans, work;
    static boolean isFirst;

    public static void main(String[] args) {
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i-1]*3;
        }

        Scanner scanner = new Scanner(System.in);
        W = scanner.nextInt();

        int max_digit = -1;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i]-1)/2 >= W) {
                max_digit = i;
                break;
            }
        }

        ans = new String[max_digit+1];
        work = new String[max_digit+1];

        recursive(max_digit, 0);

        isFirst = true;
        for (int i = max_digit; i >= 0; i--) {
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

    static void recursive(int digit, int tmp_sum) {
        if (digit == -1) {
            if (tmp_sum == W) {
                for (int i = digit; i <= ans.length-1; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = "0";
        recursive(digit-1, tmp_sum);
        work[digit] = "+";
        recursive(digit-1, tmp_sum+POW[digit]);
        if (tmp_sum > 0) {
            work[digit] = "-";
            recursive(digit-1, tmp_sum-POW[digit]);
        }
    }
}
```

This Java code does the same thing as your Python code. It calculates the sum of the powers of 3 from 1 to `W` and prints the corresponding operations. The operations are printed in the order they were calculated.
<|EOT|>
