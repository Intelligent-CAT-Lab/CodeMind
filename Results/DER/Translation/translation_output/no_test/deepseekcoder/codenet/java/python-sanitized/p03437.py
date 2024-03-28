import sys
import math
import copy
from collections import defaultdict

def main():
    x, y = map(int, sys.stdin.readline().split())
    if x % y == 0:
        print(-1)
    else:
        print(x)

if __name__ == "__main__":
    main()