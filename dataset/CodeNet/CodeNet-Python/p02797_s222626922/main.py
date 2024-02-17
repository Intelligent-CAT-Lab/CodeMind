n, k, s = map(int, input().split())
num = 998245637
arr = [s]*k
arr2 = [num]*(n-k)
print(*(arr+arr2))
