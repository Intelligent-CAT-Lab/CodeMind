import sys

n = int(sys.stdin.readline())
print(n, end=":")

for i in range(2, int(n**0.5) + 1):
    if n % i == 0:
        n = n // i
        print(" ", i, end="")

print(" ", n)