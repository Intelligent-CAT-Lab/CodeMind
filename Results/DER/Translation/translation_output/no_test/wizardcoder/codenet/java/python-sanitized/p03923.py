import java.util.ArrayDeque
import java.util.Arrays
import java.util.List
import java.util.Scanner

class p03923:
    def main(self):
        self.run()

    def run(self):
        sc = Scanner(System.in)
        n = sc.nextLong()
        a = sc.nextLong()
        print(self.solver(n, a))

    def solver(self, n, a):
        ans = n
        if n == 1:
            return 1
        for i in range(1, 41):
            # min ( k1 + k2 +... ki + a*(i-1) )
            # k1*k2*k3*...*ki>=n
            t = a * (i - 1)
            maxK = self.f(i, n)
            curK = 1
            for j in range(i):
                if curK * self.pow(maxK - 1, i - j) // self.pow(maxK - 1, i - j) == curK and curK * self.pow(maxK - 1, i - j) < n:
                    t += maxK
                    if curK!= curK * maxK // maxK:
                        curK = n
                    else:
                        curK *= maxK
                else:
                    t += maxK - 1
                    if curK!= curK * (maxK - 1) // (maxK - 1):
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
                if v!= v * middle // middle:
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
        for i in range(63, -1, -1):
            if (n >> i) & 1 == 1:
                ret = ret * ret * a
            a = a * a
        return ret

    def solver2(self, n, a):
        dp = [0] * (2 * n)
        for i in range(2 * n):
            dp[i] = 1000000000
        dp[0] = 0
        for i in range(n):
            if i!= 0:
                for j in range(i, 2 * n, i):
                    dp[j] = min(dp[j], dp[i] + a + j // i)
            else:
                for j in range(1, 2 * n):
                    dp[j] = j
        ans = 1000000000
        for i in range(n, 2 * n):
            ans = min(ans, dp[i])
        return ans

    def tr(self, *objects):
        print(Arrays.deepToString(objects))

p03923().main()