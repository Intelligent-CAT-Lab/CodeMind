class main:
    import math
    
    def digit(num):
        r = 0
        while num > 0:
            r += num % 10
            num //= 10
        return r
    
    def main():
        n = int(input())
        ans = n
        for a in range(2, n//2+1):
            b = n - a
            sum = digit(a) + digit(b)
            ans = min(sum, ans)
        print(ans)
    
    if __name__ == "__main__":
        main()