class main:
    MOD = int(1e9 + 7)
    
    def floor(a, b):
        if b < 0:
            a *= -1
            b *= -1
    
        if a > 0:
            return a // b
        else:
            return (a - b + 1) // b
    
    def ceil(a, b):
        if b < 0:
            a *= -1
            b *= -1
    
        if a > 0:
            return (a + b - 1) // b
        else:
            return a // b
    
    def q(a, b):
        if b > 0:
            return floor(a, b) 
        else:
            return ceil(a, b)
    
    def r(a, b):
        return a - q(a, b) * b
    
    def run():
        N = int(input())
        ans = "0" if N == 0 else ""
        while N != 0:
            q_val = q(N, -2)
            r_val = r(N, -2)
            ans = str(r_val) + ans
            N = q_val
        print(ans)
    
    run()