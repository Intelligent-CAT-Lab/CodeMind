import sys
import math

# Custom fast input function to mimic FastScanner
def fast_input():
    return sys.stdin.readline().strip().split()

# Reading input as integers
n, a, b = map(int, fast_input())

# Calculating the answer
ans = (n // (a + b)) * a + min(a, n % (a + b))

# Outputting the result
print(ans)