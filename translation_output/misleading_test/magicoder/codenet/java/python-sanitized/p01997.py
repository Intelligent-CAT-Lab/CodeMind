import sys
import math

def solve(inp):
    a, b = map(float, inp.readline().split())
    print(4.0/3.0*math.pi*b*b*b)

if __name__ == "__main__":
    solve(sys.stdin)