class main:
    import sys
    import math
    
    def solver(n):
        sqrt = math.isqrt(n)
        x = 0
        y = 0
        for i in range(sqrt, 0, -1):
            if n % i == 0:
                x = i
                y = n // i
                break
        if x != 0 and y != 0:
            ans = (x - 1) + (y - 1)
        else:
            ans = n - 1
        return ans
    
    def main():
        n = int(sys.stdin.readline())
        print(solver(n))
    
    if __name__ == "__main__":
        main()