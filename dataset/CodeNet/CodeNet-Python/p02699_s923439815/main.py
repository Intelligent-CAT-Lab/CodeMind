import sys,os
from collections import defaultdict, deque
from math import ceil, floor
if sys.version_info[1] >= 5:
    from math import gcd
else:
    from fractions import gcd
sys.setrecursionlimit(10**6)
write = sys.stdout.write
dbg = (lambda *something: print(*something)) if 'TERM_PROGRAM' in os.environ else lambda *x: 0
def main(given=sys.stdin.readline):
    input = lambda: given().rstrip()
    LMIIS = lambda: list(map(int,input().split()))
    II = lambda: int(input())
    MOD = 10**9+7

    S,W = LMIIS()
    if S <= W:
        print('unsafe')
    else:
        print('safe')
    

if __name__ == '__main__':
    main()