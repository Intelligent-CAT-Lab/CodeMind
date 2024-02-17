n = int(input())
cnt = 0
for k in range(n):
    for j in range(n):
        if 4*k+7*j == n:
            cnt += 1
if n < 4 or cnt == 0:
    print("No")
else:
    print("Yes")