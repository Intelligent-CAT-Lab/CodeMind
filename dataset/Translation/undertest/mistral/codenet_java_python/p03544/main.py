n = int(input())
num = [0] * 100

if n == 0:
    num[0] = 2
elif n == 1:
    num[0] = 1
else:
    num[0], num[1] = 2, 1
    for i in range(2, n):
        num[i] = num[i-1] + num[i-2]

print(num[n])