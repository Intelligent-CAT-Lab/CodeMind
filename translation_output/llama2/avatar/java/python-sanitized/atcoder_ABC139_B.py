import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
kuti = 1
tap = 0

while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

print(tap)