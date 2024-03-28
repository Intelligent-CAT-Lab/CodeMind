def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(str(i) + " " + str(j))
                l.append(str(i) + " " + (a - j + 1))
                l.append((a - i + 1) + " " + str(j))
                l.append((a - i + 1) + " " + (a - j + 1))
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
    res = [int(x) for x in input().split()]
    return res

def ns(k):
    res = [input().strip() for x in range(k)]
    return res

def ni(a, b):
    res = [[int(x) for x in input().split()] for x in range(a)]
    return res

# Sample test case
a = ni()
l = []
solve(a, l)
print(len(l))
for s in l:
    out(s)