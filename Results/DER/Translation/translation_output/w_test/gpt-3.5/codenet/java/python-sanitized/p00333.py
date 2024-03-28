def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

inp = input().split()
W = int(inp[0])
H = int(inp[1])
C = int(inp[2])

WH = gcd(W, H)
a = (W // WH) * (H // WH)
print(a * C)