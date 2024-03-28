class main:
    import math
    import sys
    
    dx = [0, 1, 0, -1]
    dy = [-1, 0, 1, 0]
    MOD = 10**9 + 7
    
    def q(a, b):
        return math.floor(a / b) if b > 0 else math.ceil(a / b)
    
    def r(a, b):
        return a - q(a, b) * b
    
    def main():
        N = int(input())
        ans = "0" if N == 0 else ""
        while N != 0:
            quotient = q(N, -2)
            remainder = r(N, -2)
            ans = str(remainder) + ans
            N = quotient
        print(ans)
    
    if __name__ == "__main__":
        main()