System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
W0)+

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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int[] POW = new int[15];
        POW[0] = 1;
        for (int i = 1; i < 15; i++) {
            POW[i] = POW[i - 1] * 3;
        }
        int maxDigit = 0;
        while ((POW[maxDigit] - 1) / 2 >= W) {
            maxDigit++;
        }
        char[] ans = new char[maxDigit + 1];
        int[] work = new int[maxDigit + 1];
        recursive(maxDigit, W, ans, work, POW);
        boolean isFirst = true;
        for (int i = maxDigit; i >= 0; i--) {
            if (ans[i] == '0') {
                if (isFirst) {
                    continue;
                } else {
                    System.out.print("0");
                }
            } else if (ans[i] == '+') {
                isFirst = false;
                System.out.print("+");
            } else { //ans[i] == '-'
                isFirst = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void recursive(int digit, int tmpSum, char[] ans, int[] work, int[] POW) {
        if (digit == -1) {
            if (tmpSum == 0) {
                for (int i = digit; i >= 0; i--) {
                    ans[i] = (char) work[i];
                }
            }
            return;
        }
        work[digit] = 0;
        recursive(digit - 1, tmpSum, ans, work, POW);
        work[digit] = 1;
        recursive(digit - 1, tmpSum + POW[digit], ans, work, POW);
        if (tmpSum > 0) {
            work[digit] = -1;
            recursive(digit - 1, tmpSum - POW[digit], ans, work, POW);
        }
    }
}
```<|endoftext|>
