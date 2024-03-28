import sys

class p03923:
    def __init__(self):
        self.n = 0
        self.a = 0

    def run(self):
        self.n = int(sys.stdin.readline().strip())
        self.a = int(sys.stdin.readline().strip())
        print(self.solver(self.n, self.a))

    def solver(self, n, a):
        ans = n
        if n == 1:
            return 1
        for i in range(1, 41):
            t = a * (i - 1)
            maxK = self.f(i, n)
            curK = 1
            for j in range(i):
                if curK * self.pow(maxK - 1, i - j) / self.pow(maxK - 1, i - j) == curK and curK * self.pow(maxK - 1, i - j) < n:
                    t += maxK
                    if curK != curK * maxK / maxK:
                        curK = n
                    else:
                        curK *= maxK
                else:
                    t += maxK - 1
                    if curK != curK * (maxK - 1) / (maxK - 1):
                        curK = n
                    else:
                        curK *= maxK - 1
            ans = min(ans, t)
        return ans

    def f(self, i, n):
        ok = n
        ng = 0
        while ok - ng > 1:
            middle = (ok + ng) // 2
            v = 1
            for k in range(i):
                if v != v * middle // middle:
                    ok = middle
                    break
                v *= middle
            if v >= n:
                ok = middle
            else:
                ng = middle
        return ok

    def pow(self, a, n):
        ret = 1
        for _ in range(n):
            ret *= a
        return ret

    def solver2(self, n, a):
        dp = [float('inf')] * (2 * n)
        dp[0] = 0
        for i in range(n):
            if i != 0:
                for j in range(i, 2 * n, i):
                    dp[j] = min(dp[j], dp[i] + a + j // i)
            else:
                for j in range(1, 2 * n):
                    dp[j] = j
        ans = float('inf')
        for i in range(n, 2 * n):
            ans = min(ans, dp[i])
        return ans

    def tr(self, *objects):
        print(objects)

if __name__ == "__main__":
    p03923().run()