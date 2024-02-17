import sys
sys.setrecursionlimit(10**5)

def LI(): return [int(x) for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LI_(): return [-1*int(x) for x in input().split()]
def II(): return int(input())
def IF(): return float(input())
def LM(func,n): return [[func(x) for x in input().split()]for i in range(n)]
mod = 1000000007
inf = float('INF')

def isCat(S):
    #print(S)
    if len(S) == 0:
        return True
    if S[0] != "m" or S[-1] != "w":
        return False
    c = 0
    i=0
    for i in range(1,len(S)-1):
        if S[i] == 'm':
            c += 1
        elif S[i] == 'w':
            c -= 1
        if c ==0:
            break
    if S[1] == 'e':
        i = 0
    return S[i+1] == 'e' and isCat(S[1:i+1]) and isCat(S[i+2:-1])



if(isCat(input())):
    print("Cat")
else:

    print("Rabbit")
