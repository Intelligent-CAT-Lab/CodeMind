n, k, s = map(int, "4 2 3".split())
num = 998245637
arr = [s]*k
arr2 = [num]*(n-k)
print(*(arr+arr2))
