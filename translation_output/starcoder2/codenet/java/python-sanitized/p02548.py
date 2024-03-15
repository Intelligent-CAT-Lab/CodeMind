from math import *

n = int(input())
cnt = 0
for i in range(1, n+1):
    for j in range(1, n+1):
        if i*j < n:
            cnt += 1
        else:
            break
print(cnt)

/Python/Python_Basic/Python_Basic_0