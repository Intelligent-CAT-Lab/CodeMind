import sys

MOD = 10**9 + 7

def solve():
    X = input()[0]
    Y = input()[0]
    ans = "="
    if X < Y:
        ans = "<"
    elif X > Y:
        ans = ">"
    print(ans)

solve()