n, k, s = list(map(int, input().split()))
num = 998245637
arr = [s]*k
arr2 = [num]*(n-k)
print((*(arr+arr2)))
