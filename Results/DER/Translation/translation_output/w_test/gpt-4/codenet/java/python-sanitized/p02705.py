import math
import sys

def solve(r):
    pi = math.pi
    return 2 * pi * r

if __name__ == "__main__":
    t = 1  # or we could set t = int(input()) to take number of test cases
    for _ in range(t):
        r = float(sys.stdin.readline().strip())
        result = solve(r)
        print(f"{result:.20f}")

# To run the test case you can perform this in the shell:
# echo "1" | python script_name.py