# -*- coding: utf-8 -*-
# 整数の入力
A, B, C, D = map(int, "10 9 10 10".split())
while(1):
  C = C -B 
  if C <= 0:
    print("Yes")
    break
  A = A - D
  if A <= 0:
    print("No")
    break