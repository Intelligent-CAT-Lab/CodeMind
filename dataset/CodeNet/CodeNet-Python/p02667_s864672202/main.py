import sys

sys.setrecursionlimit(10 ** 6)
int1 = lambda x: int(x) - 1
p2D = lambda x: print(*x, sep="\n")
def II(): return int(sys.stdin.readline())
def MI(): return map(int, sys.stdin.readline().split())
def LI(): return list(map(int, sys.stdin.readline().split()))
def LLI(rows_number): return [LI() for _ in range(rows_number)]
def SI(): return sys.stdin.readline()[:-1]

def main():
    s=SI()
    n=len(s)
    n2=n//2
    ans=n2*(n2+1)+n%2*(n2+1)
    #print(ans)
    rem=0
    for i,c in enumerate(s):
        if c=="1":continue
        ans-=(rem+1)//2
        if rem%2==0 and i%2==0:ans-=1
        if (i-rem)%2==0:rem+=1
    print(ans)

main()