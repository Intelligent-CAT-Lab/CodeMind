import sys
import math

def c(a, b):
    return math.factorial(a) * math.factorial(b) % 1000000007

def fact(a):
    return math.factorial(a)

def solve(test_number, in, out):
    i = in.nextInt()
    md = [0] * (i - 1)
    rm = i - 2
    lx = i - 2
    while rm >= 0:
        md[lx + 1] = c(rm, lx)
        rm -= 2
        lx -= 1
    res = 0
    prev = 0
    for m in range(1, i):
        cur = fact(m) * fact(i - m - 1) % 1000000007
        cur = cur * md[m] % 1000000007
        res += (cur - prev + 1000000007) * m % 1000000007
        prev = cur
    out.println(res % 1000000007)

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    solve(1, in, out)