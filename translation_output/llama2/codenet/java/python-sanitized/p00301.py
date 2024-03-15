import sys

n = int(sys.stdin.readline())
a = [0] * 15
i = 0
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

while i > 0:
    print(f"{a[i] == 0 ? '0' : a[i] > 0 ? '+' : '-'}{i == 0 ? '\n' : ''}")
    i -= 1