n = int(input())
a = [0] * 15
i = 0

while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i - 1]) / 3
    i += 1

for i in range(len(a)):
    print((str(a[i])[0] == '0' ? '0' : str(a[i])[0] > '0' ? '+' : '-') + (i == 0 ? '\n' : ''))