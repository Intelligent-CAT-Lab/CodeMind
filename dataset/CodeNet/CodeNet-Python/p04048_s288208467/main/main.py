import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 7)

N,X = list(map(int,input().split()))

def F(x,y):
    """
    x,yの平行四辺形。対角にたどり着くまでの距離
    """
    if x>y:
        x,y = y,x
    q,r = divmod(y,x)
    if r == 0:
        return (2*q-1)*x
    return 2*q*x + F(x,y%x)

answer = N + F(X,N-X)
print(answer)