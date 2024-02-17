n = int("5")
if n == 1:
    print(1)
else:
    ans = [2,1]
    for i in range(n-1):
        ans.append(ans[-1]+ans[-2])
    print(ans[-1])