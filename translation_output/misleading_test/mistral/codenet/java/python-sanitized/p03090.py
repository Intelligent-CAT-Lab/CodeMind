import sys

def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(str(i) + " " + str(j))
                l.append(str(i) + " " + (a - j))
                l.append((a - i) + " " + str(j))
                l.append((a - i) + " " + (a - j))
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(str(a) + " " + str(i))

def out(l):
    for i in l:
        print(i)

def out(arr):
    for i in arr:
        print(i)

def out(s):
    if debug:
        print(s)

def ni():
    return int(input())

def ns():
    return input().strip()

def ni(k):
    res = []
    for i in range(k):
        res.append(int(input()))
    input()
    return res

def ns(k):
    res = []
    for i in range(k):
        res.append(input().strip())
    return res

def ni(a, b):
    res = []
    for i in range(a):
        row = list(map(int, input().split()))
        res.append(row)
    input()
    return res

# Test input
a = int(input())

# Expected output
print(a)

# Sample test case
l = []
solve(a, l)
print(len(l))
for s in l:
    print(s)