class main:
    def gcd(x, y):
        if y == 0:
            return x
        else:
            return gcd(y, x % y)
    
    W, H, WH = map(int, input().split())
    C = int(input())
    
    a = (W//WH)*(H//WH)
    print(a*C)