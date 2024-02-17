n, m = [int(item) for item in "1 6".split()]
# Enough s
if n * 2 >= m:
    print(m//2)
# Enough m 
else:
    amari = m - n*2
    print(amari//4 + n)