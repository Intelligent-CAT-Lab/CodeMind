n, m = map(int, input().split())
print(min(n % m, -n % m))