n = int(input())
num = [0] * 100
num[0], num[1] = 2, 1
for i in range(2, 100):
    num[i] = num[i-1] + num[i-2]
print(num[n])