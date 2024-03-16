import sys

a = int(input())
b = int(input())
c = int(input())

for i in range(5000):
    if a * i % b == c:
        print("YES")
        sys.exit()

print("NO")