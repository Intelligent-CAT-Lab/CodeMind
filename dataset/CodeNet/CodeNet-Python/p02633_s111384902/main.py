x = int(input())
n = 1
while 360 * n % x != 0:
    n += 1
print(n * 360 // x)