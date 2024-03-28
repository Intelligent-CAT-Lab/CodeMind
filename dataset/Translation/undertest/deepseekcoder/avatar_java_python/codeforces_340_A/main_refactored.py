class main:
    import sys
    
    def gcd(a, b):
        if a < b:
            a, b = b, a
        while a % b != 0:
            a, b = b, a % b
        return b
    
    def lcm(x, y):
        return x * y // gcd(x, y)
    
    def main():
        x, y, a, b = map(int, sys.stdin.readline().split())
        lcm_xy = lcm(x, y)
        i = a
        while i % lcm_xy != 0:
            i += 1
        j = b
        while j % lcm_xy != 0:
            j -= 1
        if i <= j:
            print(j - i + 1)
        else:
            print(0)
    
    if __name__ == "__main__":
        main()