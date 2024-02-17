a, b, x = map(int, "180 100 2400".split())
c = 0
while x > 0:
    if x > 500:
        c += a if a < 2*b else 2*b
        x-=1000
    else:
        c += b if b < a else a
        x-=500
print(c)
