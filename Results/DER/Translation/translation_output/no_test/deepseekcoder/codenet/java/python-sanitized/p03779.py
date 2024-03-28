import sys

def p03779():
    x = int(sys.stdin.readline())
    ans = 0

    for i in range(100000):
        if x <= i * (i + 1) // 2:
            ans = i
            break
    print(ans)

p03779()