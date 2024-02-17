n, k = map(int,input().split())
a = n % k
print(min(n,a,abs(a-k)))