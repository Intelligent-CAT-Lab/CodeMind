import sys

def calc(n, st, out):
    ans = 1
    val = st
    while val < n:
        val *= 2
        ans *= 2
    out.write(f"val = {val}  ans = {ans}\n")
    return ans

def solve(test