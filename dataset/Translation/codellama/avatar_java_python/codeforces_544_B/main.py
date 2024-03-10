import sys

n, count = map(int, input().split())

a = (n + 1) // 2
b = n // 2
max_count = a * a + b * b

if count > max_count:
    print("NO")
    sys.exit()

print("YES")

for i in range(n):
    for j in range(n):
        if (i + j) % 2 == 0 and count > 0:
            print("L", end="")
            count -= 1
        else:
            print("S", end="")
    print()