arr = [1,2,3]
ans = 0
res = 0
i = len(arr) - 1
while (i >= 0):
    incr = arr[i]*(1 + res)
    ans += incr
    res = incr
    i -= 1
print(ans)