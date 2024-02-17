# coding: utf-8
# Your code here!

n, a, b = map(int,input().split())

ma = min(a,b)
mi = (a+b)-n

if mi < 0:
    mi = 0

print(ma,mi)