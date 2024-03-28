import math

def is_yes(s):
    a, b, c = 0, 0, 0
    for char in s:
        if char == 'a':
            a += 1
        elif char == 'b':
            b += 1
        elif char == 'c':
            c += 1
    return math.max(math.max(a, b), c) - math.min(math.min(a, b), c) <= 1

print("YES" if is_yes("abac") else "NO")