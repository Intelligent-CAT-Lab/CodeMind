class main:
    def gcd(a, b):
        if a < b:
            a, b = b, a
        if a % b == 0:
            return b
        else:
            return gcd(b, a % b)
    
    if __name__ == "__main__":
        a, b = map(int, input().split())
        print(gcd(a, b))