n = int(input())
print(n, end=':')
for i in range(2, n):
    if n % i == 0:
        n = n / i
        print(' ', i, end='')
print(' ', n)