import sys
import math
import numpy as np

x = []
for i in range(3):
    x.append(int(sys.stdin.readline()))
x.sort()
temp = 2*x[2]-x[1]-x[0]
ans = 0
if temp%2 == 1:
    ans = (temp+2)/2+1
else:
    ans = temp/2
print ans