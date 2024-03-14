import sys

def codeforces_55_A():
    n = int(sys.stdin.readline())
    if n & (n - 1) == 0:
        print("YES")
    else:
        print("NO")

codeforces_55_A()