N, M = list(map(int, input().split()))
a = []
for i in range(M):
    a.append(int(eval(input())))
num = N - M
ans = 0
while(num):
    ans += 1
    num -= 1
print((ans - 1))
