import sys

h, w, a, b = map(int, sys.stdin.readline().split())

s1 = "0" * a + "1" * (w - a)
s2 = "1" * b + "0" * (h - b)

print(s1)
print(s2)

for i in range(h):
    if i < b:
        print(s1)
    else:
        print(s2)