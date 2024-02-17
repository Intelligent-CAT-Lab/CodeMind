import sys
sys.setrecursionlimit(2147483647)
INF=float("inf")
MOD=10**9+7
input=lambda :sys.stdin.readline().rstrip()
def resolve():
    import re
    pattern="^A[a-z]+C[a-z]+$"
    print(("AC" if re.match(pattern,eval(input())) else "WA"))
resolve()