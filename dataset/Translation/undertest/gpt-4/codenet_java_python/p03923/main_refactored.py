class main:
    import math
    
    def main():
        n, a = map(int, input().split())
        print(solver(n, a))
    
    def solver(n, a):
        ans = n
        if n == 1:
            return 1
        for i in range(1, 41):
            t = a * (i - 1)
            max_k = f(i, n)
            cur_k = 1
            for j in range(i):
                try:
                    if cur_k * pow(max_k - 1, i - j - 1) == cur_k and cur_k * (max_k - 1) < n:
                        t += max_k
                        cur_k *= max_k
                    else:
                        raise ValueError()
                except (ValueError, OverflowError):
                    t += max_k - 1
                    cur_k *= (max_k - 1)
                    if cur_k >= n:
                        break
            ans = min(ans, t)
        return ans
    
    def f(i, n):
        ok = n
        ng = 0
        while ok - ng > 1:
            middle = (ok + ng) // 2
            v = 1
            for k in range(i):
                try:
                    if v * middle // middle != v:
                        raise ValueError()
                    v *= middle
                except (ValueError, OverflowError):
                    ok = middle
                    continue
            if v >= n:
                ok = middle
            else:
                ng = middle
        return ok
    
    def pow(a, n):
        ret = 1
        while n > 0:
            if n % 2 == 1:
                ret *= a
            a *= a
            n >>= 1
        return ret
    
    def solver2(n, a):
        dp = [math.inf] * (2 * n)
        dp[0] = 0
        for i in range(n):
            if i != 0:
                for j in range(i, 2 * n, i):
                    dp[j] = min(dp[j], dp[i] + a + j // i)
            else:
                for j in range(1, 2 * n):
                    dp[j] = j
        ans = math.inf
        for i in range(n, 2 * n):
            ans = min(ans, dp[i])
        return ans
    
    def tr(*objects):
        print(objects)
    
    if __name__ == "__main__":
        main()