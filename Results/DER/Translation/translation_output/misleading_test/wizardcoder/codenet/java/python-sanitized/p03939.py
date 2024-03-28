import math

def p03939():
    N = int(input())
    d1 = float(input())
    x = float(input())

    ans = 0

    for i in range(N):
        ans += d1 + (i-0.5)*x
        d1 = ((2*i+2)*d1 + 5*x)/(2*i+3)
        x = ((i+2)/i)*x

    print(ans)

p03939()