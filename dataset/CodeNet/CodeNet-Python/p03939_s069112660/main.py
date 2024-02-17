N, d1, xx = map(int, raw_input().split())

d = d1*1.0
x = xx*1.0

res = 0.0

while N > 1:
    res += (2*d + (2*N-1)*x) / 2
    d *= 1.0 + 1.0 / N
    d += x * 5.0/(2*N)
    x *= 1.0 + 2.0 / N
    N -= 1

print "{:.12f}".format(res + d + x/2)