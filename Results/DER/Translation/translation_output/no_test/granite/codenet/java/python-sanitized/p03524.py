import sys

S = input()
a = 0
b = 0
c = 0
for x in S:
    if x == 'a':
        a += 1
    elif x == 'b':
        b += 1
    elif x == 'c':
        c += 1
if max(a, b, c) - min(a, b, c) <= 1:
    print("YES")
else:
    print("NO")