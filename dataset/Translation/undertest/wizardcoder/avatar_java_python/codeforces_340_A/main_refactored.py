class main:
    import math
    
    def gcd(a, b):
        if b == 0:
            return a
        else:
            return gcd(b, a % b)
    
    def lcm(a, b):
        return (a * b) // gcd(a, b)
    
    def count_divisors(n):
        count = 0
        for i in range(1, int(math.sqrt(n)) + 1):
            if n % i == 0:
                count += 2
        if int(math.sqrt(n))**2 == n:
            count -= 1
        return count
    
    def main():
        x, y, a, b = map(int, input().split())
        lcm_xy = lcm(x, y)
        count = 0
        for i in range(a, b+1):
            if i % lcm_xy == 0:
                count += 1
        print(count)
    
    if __name__ == '__main__':
        main()