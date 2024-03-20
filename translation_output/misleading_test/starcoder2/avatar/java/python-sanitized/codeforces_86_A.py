import sys

def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    max = 0
    for j in range(pow):
        max = max * 10 + 9
    return a * (max - a)

l, r = map(int, sys.stdin.readline().split())
res = 0
maxxes = [0] * 10
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    maxxes[i] = temp // 2 * (temp - temp // 2)
res = max(mult(l), res)
res = max(mult(r), res)
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    if l <= temp // 2 and temp // 2 <= r:
        res = max(maxxes[i], res)
print(res)

/codeforces/codeforces_86_A.py
import sys

def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    max = 0
    for j in range(pow):
        max = max * 10 + 9
    return a * (max - a)

l, r = map(int, sys.stdin.readline().split())
res = 0
maxxes = [0] * 10
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    maxxes[i] = temp // 2 * (temp - temp // 2)
res = max(mult(l), res)
res = max(mult(r), res)
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    if l <= temp // 2 and temp // 2 <= r:
        res = max(maxxes[i], res)
print(res)
/codeforces/codeforces_86_B.py
import sys

n, m = map(int, sys.stdin.readline().split())
a = []
for i in range(n):
    a.append(list(map(int, sys.stdin.readline().split())))

for i in range(n):
    for j in range(m):
        if a[i][j] == 1:
            for k in range(n):
                if a[k][j] == 1:
            1:
                    a[i][k] = 1

for i in range(n):
    for j in range(m):
        print(a[i][j], end=' ')
    print()
         a[i][k] = 1
            for k in range(m):
                if a[i][k] == 1:
                    a[k][j] = 1

for i in range(n):
    for j in range(m):
        if a[i][j] == 1:
            for k in range(n):
                if a[k][j] == 1 and a[i][k] == 0 and a[k][i] ==/codeforces/codeforces_86_B.md
# Codeforces 86 B