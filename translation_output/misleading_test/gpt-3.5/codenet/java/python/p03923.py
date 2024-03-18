```python
class p03923:
    def __init__(self):
        pass

    def run(self):
        n, a = map(int, input().split())
        print(self.solver(n, a))

    def solver(self, n, a):
        ans = n
        if n == 1:
            return 1
        for i in range(1, 41):
            t = a * (i - 1)
            maxK = self.f(i, n)
            curK = 1
            for j in range(i):
                if (curK * self.pow(maxK - 1, i - j) // self.pow(maxK - 1, i - j) == curK) and (curK * self.pow(maxK - 1, i - j) < n):
                    t += maxK
                    if curK != curK * maxK // maxK:
                        curK = n
                    else:
                        curK *= maxK
                else:
                    t += maxK - 1
                    if curK != curK * (maxK - 1) // (maxK - 1):
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
        while n > 0:
            if n % 2 == 1:
                ret *= a
            n >>= 1
            a *= a
        return ret

if __name__ == "__main__":
    p = p03923()
    p.run()
```
```python
# Test case
'''
Input: 8 1
Output: 66
'''
```  
