import sys

class p03923:
    def run(self):
        n = int(sys.stdin.readline())
        a = int(sys.stdin.readline())
        print(self.solver(n, a))

    def solver(self, n, a):
        ans = n
        if n == 1:
            return 1
        for i in range(1, 41):
            t = a * (i - 1)
            max_k = self.f(i, n)
            cur_k = 1
            for j in range(i):
                if cur_k * pow(max_k - 1, i - j) / pow(max_k - 1, i - j) == cur_k and cur_k * pow(max_k - 1, i - j) < n:
                    t += max_k
                    if cur_k != cur_k * max_k / max_k:
                        cur_k = n
                    else:
                        cur_k *= max_k
                else:
                    t += max_k - 1
                    if cur_k != cur_k * (max_k - 1) / (max_k - 1):
                        cur_k = n
                    else:
                        cur_k *= max_k - 1
            ans = min(ans, t)
        return ans

    def f(self, i, n):
        ok = n
        ng = 0
        while ok - ng > 1:
            middle = (ok + ng) // 2
            v = 1
            for k in range(i):
                if v != v * middle / middle:
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

    def solver2(self,