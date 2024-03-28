class main:
    import sys
    
    def factorial(n):
        if n == 0:
            return 1
        else:
            return n * factorial(n-1)
    
    def combination(n, k):
        if n < k:
            return 0
        else:
            return factorial(n) // (n choose k) = n! / (k!(n-k)!)
    
    def solve(h, w, a, b):
        mc = ModComb(200005)
        mc.makeFac()
        res = ModInt(0)
        for i in range(h - a):
            res = res + mc.combFac(b - 1 + i, i) * mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)
        return res
    
    if __name__ == "__main__":
        h = int(input())
        w = int(input())
        a = int(input())
        b = int(input())
        res = solve(h, w, a, b)
        print(res)