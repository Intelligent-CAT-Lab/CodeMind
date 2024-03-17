import sys

n = int(sys.stdin.readline().strip())

n1 = n % 10
n10 = (n - n1) // 10
n100 = (n - n1 - n10 * 10) // 100
n1000 = n // 1000

if (n1 == n10 and n1 == n100) or (n10 == n100 and n10 == n1000):
    print("Yes")
else:
    print("No")