n, m = map(int, input().split())
if n % 2 == 0:
    print(0, end = '')
    for i in range(1, n // 2 + 1):
        print(' 0', end = '')
    for i in range(n // 2 + 1, n):
        print(' ' + str(m), end = '')
else:
    print(0, end = '')
    for i in range(1, n // 2 + 1):
        print(' 0', end = '')
    for i in range(n // 2 + 1, n):
        print(' ' + str(m), end = '')
print()