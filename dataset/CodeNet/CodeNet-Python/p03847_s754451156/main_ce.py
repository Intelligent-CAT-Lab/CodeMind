def d_XorSum(N):
    MOD = 10**9 + 7
    memo = {0: 1, 1: 2}
    # N=0のとき(u,v)の組は(0,0)の1通り
    # N=1のとき(0,0),(1,1)の2通り
    def f(k):
        # a+b<=k,a xor b <= k を満たす正整数(a,b)の組の個数(ただしa>=b)
        if k in memo:
            return memo[k]
        ret = (f(k // 2) + f((k - 1) // 2) + f((k - 2) // 2)) % MOD
        memo[k] = ret
        return ret
    return f(N)
N = int("3")
print(d_XorSum(N))