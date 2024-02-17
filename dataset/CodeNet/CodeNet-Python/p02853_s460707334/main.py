# -*- coding: utf-8 -*-

x, y = map(int, input().split())

result = 0

if x == 1:
    result += 300000
elif x == 2:
    result += 200000
elif x == 3:
    result += 100000

if y == 1:
    result += 300000
elif y == 2:
    result += 200000
elif y == 3:
    result += 100000
    
if x == 1 and y == 1:
    result += 400000
    
print(result)