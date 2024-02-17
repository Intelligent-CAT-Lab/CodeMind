n, k = map(int,"7 4".split())
a = n % k
print(min(n,a,abs(a-k)))