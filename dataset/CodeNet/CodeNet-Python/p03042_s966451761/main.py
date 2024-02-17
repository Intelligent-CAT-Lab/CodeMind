import sys


def input(): return sys.stdin.readline().strip()
def I(): return int(input())
def LI(): return list(map(int, input().split()))
def IR(n): return [I() for i in range(n)]
def LIR(n): return [LI() for i in range(n)]
def SR(n): return [S() for i in range(n)]
def S(): return input()
def LS(): return input().split()


INF = float('inf')


def is_yymm(f, l):
    if 1 <= l <= 12:
        return True
    return False


def is_mmyy(f, l):
    if 1 <= f <= 12:
        return True
    return False


s = S()
f = int(s[:2])
l = int(s[2:])

if is_yymm(f, l) and is_mmyy(f, l):
    print('AMBIGUOUS')

elif is_yymm(f, l) and not(is_mmyy(f, l)):
    print('YYMM')

elif not(is_yymm(f, l)) and is_mmyy(f, l):
    print('MMYY')

else:
    print('NA')
