import sys

def p03345():
    a, b, c, k = map(int, sys.stdin.readline().split())
    ans = a - b
    if abs(ans) > pow(10, 18):
        print("Unfair")
        return
    if k % 2 == 0:
        print(ans)
    else:
        print(ans * -1)

p03345()