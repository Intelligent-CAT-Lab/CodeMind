n = int(input())
a = [0] * 15
i = 0
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1
while i > 0:
    i -= 1
    print((a[i] == 0 and '0' or a[i] > 0 and '+' or '-') + (i == 0 and '\n' or ''))