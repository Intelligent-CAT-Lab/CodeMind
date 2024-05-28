n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)