a,b,x = [int(i) for i in "3 1 5".split()]
d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)
