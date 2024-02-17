def main():
    import sys
    input = sys.stdin.readline

    h,w,k = list(map(int,input().split()))
    mod = 10**9+7

    if w == 1:
        print((1))
        return

    fib = [1,2,3,5]
    for i in range(100):
        fib.append(fib[len(fib)-1]+fib[len(fib)-2])
    fib.append(1)
    fib.append(1)
    fib.append(1)


    dp = [[0]*w for _ in [0]*h]
    dp[0][0] = fib[w-2]
    dp[0][1] = fib[w-3]

    for i in range(1,h):
        for j in range(w):
            dp[i][j] = (dp[i-1][j]*fib[j-1]*fib[w-2-j])%mod
            if j >= 1:
                dp[i][j] = (dp[i][j] + dp[i-1][j-1]*fib[j-2]*fib[w-2-j])%mod
            if j <= w-2:
                dp[i][j] = (dp[i][j] + dp[i-1][j+1]*fib[j-1]*fib[w-3-j])%mod
    
    print((dp[-1][k-1]))

if __name__ == '__main__':
    main()