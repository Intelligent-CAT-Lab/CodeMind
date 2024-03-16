Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int SIZE = 15;
        int[] POW = new int[SIZE];
        POW[0] = 1;
        for(int i=1;i<SIZE;i++){
            POW[i] = POW[i-1]*3;
        }
        int max_digit = -1;
        for(int i=0;i<SIZE;i++){
            if((POW[i]-1)/2 >= W){
                max_digit = i;
                break;
            }
        }
        char[] ans = new char[max_digit+1];
        char[] work = new char[max_digit+1];
        recursive(max_digit,0,ans,work,W,SIZE);
        boolean isFirst = true;
        for(int i=max_digit;i>=0;i--){
            if(ans[i] == '0'){
                if(isFirst){
                    continue;
                }else{
                    System.out.print("0");
                }
            }else if(ans[i] == '+'){
                isFirst = false;
                System.out.print("+");
            }else{ //ans[i] == '-'
                isFirst = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }
    public static void recursive(int digit,int tmp_sum,char[] ans,char[] work,int W,int SIZE){
        if(digit == -1){
            if(tmp_sum == W){
                for(int i=0;i<=digit;i++){
                    System.out.print(work[i]);
                }
                System.out.println();
            }
            return;
        }
        work[digit] = '0';
        recursive(digit-1,tmp_sum,ans,work,W,SIZE);
        work[digit] = '+';
        recursive(digit-1,tmp_sum+POW[digit],ans,work,W,SIZE);
        if(tmp_sum > 0){
            work[digit] = '-';
            recursive(digit-1,tmp_sum-POW[digit],ans,work,W,SIZE);
        }
    }
}
```<|endoftext|>
