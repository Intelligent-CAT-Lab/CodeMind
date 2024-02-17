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
W = int("25")
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
