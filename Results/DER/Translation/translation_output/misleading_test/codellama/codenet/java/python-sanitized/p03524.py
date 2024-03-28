import math

def solve(s):
    a, b, c = 0, 0, 0
    for char in s:
        if char == 'a':
            a += 1
        elif char == 'b':
            b += 1
        elif char == 'c':
            c += 1
    if math.max(math.max(a, b), c) - math.min(math.min(a, b), c) <= 1:
        return "YES"
    else:
        return "NO"

s = "abac"
print(solve(s))