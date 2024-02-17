MOD = 10**9+7

def sum(a,d,n):
    return n*(2*a+(n-1)*d)//2

def main():
    n,m = list(map(int,input().split()))

    s = 0
    if n == 1:
        s = m+1
    else:
        s = sum(m+1,-n+1,1+m//(n-1))
        s *= 2
        s -= (m+1)

    print((s%MOD))

if __name__ == '__main__':
    main()