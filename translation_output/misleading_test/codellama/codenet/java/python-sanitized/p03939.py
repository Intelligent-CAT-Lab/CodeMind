import math

def p03939(N, d1, x):
    ans = 0
    for i in range(N):
        ans += d1 + (i+0.5)*x
        d1 = ((2*i+2)*d1 + 5*x)/(2*i)
        x = ((i+2)/i)*x
    return ans

# Test case
N = 1
d1 = 3
x = 3
print(p03939(N, d1, x))