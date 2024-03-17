import sys

h, w, a, b = map(int, sys.stdin.readline().split())

s1 = ""
s2 = ""

for j in range(w):
    if j < a:
        s1 += "0"
        s2 += "1"
    else:
        s1 += "1"
        s2 += "0"

for i in range(h):
    if i < b:
        print(s1)
    else:
        print(s2)
    print()