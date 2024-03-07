import sys

a, b, x = map(int, sys.stdin.readline().split())

if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")


Next, we assign the values of `a`, `b`, and `x` to the corresponding variables.