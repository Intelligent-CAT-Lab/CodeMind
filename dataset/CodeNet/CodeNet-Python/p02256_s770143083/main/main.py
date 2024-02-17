a, b = list(map(int, input().split()))

def gcd(a,b):
    if b>a:
        a, b = b, a
    
    while b>0:
        mod = a%b
        a = b
        b = mod
    
    return a

print((gcd(a,b)))

