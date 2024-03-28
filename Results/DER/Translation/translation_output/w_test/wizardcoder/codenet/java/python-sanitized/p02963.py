import sys

s = int(sys.stdin.readline().strip())
a = 1000000000

print("0 0", a, "2 2", (a - s % a) % a, (s - 1) // a + 1)