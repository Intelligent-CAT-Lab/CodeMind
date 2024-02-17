n, a, b = [int(item) for item in input().split()]
if n < a + (b-1) or n > a + (b-1) * a:
    print(-1)
    exit()
for i in range(a):
    print(n - a + i + 1, end=" ")
n -= a
if n == 0:
    print("")
    exit()
loop = n // (b-1)
option = n % (b-1)
for j in range(b-1):
    if option > 0:
        for i in range(loop+1):
            print(n - loop - 1 + i + 1, end=" ")
        n -= loop + 1
        option -= 1
    else:
        for i in range(loop):
            print(n - loop + i + 1, end=" ")
        n -= loop
print("")