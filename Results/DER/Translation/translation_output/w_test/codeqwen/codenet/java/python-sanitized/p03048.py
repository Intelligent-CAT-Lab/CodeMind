import sys
import math

R = int(sys.stdin.readline())
G = int(sys.stdin.readline())
B = int(sys.stdin.readline())
N = int(sys.stdin.readline())

f = 0
for r in range(N // R + 1):
    for g in range((N - r * R) // G + 1):
        if (N - r * R - g * G) % B == 0:
            f += 1

print(f)
sys.stdout.flush()
sys.stdout.close()