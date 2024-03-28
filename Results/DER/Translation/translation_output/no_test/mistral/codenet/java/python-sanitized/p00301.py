import sys

n = int(input())
a = [0] * 15
i = 0

while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i - 1]) / 3
    i += 1

for j in range(i - 1, -1, -1):
    print((str(a[j])[0] == '0' ? '0' : str(a[j])[0] + ' ') + (j == 0 ? '\n' : ''))