> Translate the following python code to java and enclose your solution inside :

# -*- coding: utf-8 -*-
 
import math
import itertools
import sys
import copy
 
# å
¥å
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