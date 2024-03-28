# Code translated from Java to Python
# Test input: 8 6
# Expected output: -15

import sys

def main():
    input_vals = sys.stdin.readline().strip().split()
    x, y = map(int, input_vals)
    
    if x % y == 0:
        print(-1)
    else:
        print(x)

if __name__ == "__main__":
    main()