class main:
    import sys
    
    def fact(n):
        if n == 0:
            return 1
        else:
            return n * fact(n-1)
    
    def inv_fact(n):
        if n == 1:
            return 1
        else:
            return (fact(n) * inv_fact(n-1)) % 998244353
    
    def solve(height, width):
        ph = [1] * (width+1)
        ph[0] = 1
        for i in range(1, len(ph)):
            ph[i] = (ph[i-1] * (height+1)) % 998244353
    
        pw = [1] * (height+1)
        pw[0] = 1
        for i in range(1, len(pw)):
            pw[i] = (pw[i-1] * (width+1)) % 998244353
    
        res = 0
        for common in range(0, min(height, width)+1):
            ways = fact(height) * inv_fact(common) % 998244353 * inv_fact(height-common) % 998244353 * fact(width) % 998244353 * inv_fact(width-common) % 998244353
            if common % 2 == 0:
                res += ways
            else:
                res -= ways
    
        res %= 998244353
        if res < 0:
            res += 998244353
    
        return res
    
    if __name__ == "__main__":
        height = int(input())
        width = int(input())
        print(solve(height, width))