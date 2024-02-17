n = 1
m = 5
if m < n:
    print(-1)
else:
    summation = 0
    for i in range(n, m+1):
        summation += i
    print(bin(round(summation/(m - n + 1))))