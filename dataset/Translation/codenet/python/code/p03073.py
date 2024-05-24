import sys
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def II(): return int(sys.stdin.readline())
def LS(): return sys.stdin.readline().split()
sys.setrecursionlimit(10**7)
INF = 10 ** 18
MOD = 10 ** 9 + 7
def LI_(): return [int(x) - 1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def SI(): return input()
YN = lambda b: print('YES') if b else print('NO')
yn = lambda b: print('Yes') if b else print('No')

S = SI().strip()

N = len(S)

zero_start = 0
zero_start_counter = 0
for i in range(N):
    if not zero_start == int(S[i]):
        zero_start_counter += 1
    zero_start = (zero_start+1)%2

one_start_counter = N - zero_start_counter

print(min(zero_start_counter, one_start_counter))
