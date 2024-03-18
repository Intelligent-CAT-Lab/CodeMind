# input
N = int(input())

# calculation
ans = 1
for num in range(N, 1, -1):
    ans *= num

# output
print(ans)