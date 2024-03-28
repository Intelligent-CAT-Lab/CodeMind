class main:
    import math
    
    def pow(a, n):
        ret = 1
        for _ in range(int(n)):
            ret *= a
        return ret
    
    def f(i, n):
        ok = n
        ng = 0
        while ok - ng > 1:
            middle = (ok + ng) // 2
            v = 1
            for _ in range(int(i)):
                if v * pow(middle, i - _) / pow(middle, i - _) != v:
                    ok = middle
                    break
                v *= middle
            if v >= n:
                ok = middle
            else:
                ng = middle
        return ok
    
    def solver(n, a):
        ans = n
        if n == 1:
            return 1
        for i in range(1, 41):
            t = a * (i - 1)
            maxK = f(i, n)
            curK = 1
            for _ in range(int(i)):
                if curK * pow(maxK - 1, i - _) / pow(maxK - 1, i - _) == curK and curK * pow(maxK - 1, i - _) < n:
                    t += maxK
                    if curK * maxK / maxK != curK:
                        curK = n
                    else:
                        curK *= maxK
                else:
                    t += maxK - 1
                    if curK * (maxK - 1) / (maxK - 1) != curK:
                        curK = n
                    else:
                        curK *= maxK - 1
            ans = min(ans, t)
        return ans
    
    def main():
        n, a = map(int, input().split())
        print(solver(n, a))
    
    if __name__ == "__main__":
        main()