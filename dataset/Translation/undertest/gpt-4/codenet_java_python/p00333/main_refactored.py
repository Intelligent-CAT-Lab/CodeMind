class main:
    def gcd(x, y):
        if y == 0:
            return x
        else:
            return gcd(y, x % y)
    
    def main():
        W, H, C = map(int, input().split())
        WH = gcd(W, H)
        a = (W // WH) * (H // WH)
        print(a * C)
    
    if __name__ == "__main__":
        main()