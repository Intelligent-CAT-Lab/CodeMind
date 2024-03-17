import sys

class Solution:
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
                if curK * pow(maxK - 1, i - j) / pow(maxK - 1, i - j) == curK and curK * pow(maxK - 1, i - j) < n:
                    t += maxK
                    if curK!= curK * maxK / maxK:
                        curK = n
                    else:
                        curK *= maxK
                else:
                    t += maxK - 1
                    if curK!= curK * (maxK - 1) / (maxK - 1):
                        curK = n
                    else:
                        curK *= maxK - 1
            ans = min(ans, t)
        return ans

    def f(self, i, n):
        ok = n
        ng = 0
        while ok - ng > 1:
            middle = (ok + ng) / 2
            v = 1
            for k in range(i):
                if v!= v * middle / middle:
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

def main():
    sol = Solution()
    n, a = map(int, sys.stdin.readline().split())
    print(sol.solver(n, a))

if __name__ == '__main__':
    main()