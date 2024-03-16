n = int(input())
print(n, end=' ')
m = n
for i in range(n - 1, 0, -1):
    if m % i == 0:
        print(i, end=' ')
        m = i