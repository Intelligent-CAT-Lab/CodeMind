# coding:utf-8
import math
N = int(eval(input()))
x = math.ceil(N/1.08)
if math.floor(x*1.08) == N:
  print(x)
else:
  print(":(")