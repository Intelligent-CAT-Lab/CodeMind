import sys
import io
import time
import re

sys.stdin = io.StringIO(INPUT)
sys.stdout = io.StringIO()

def solve():
    s = input()
    l = len(s)

    if l % 2 == 0 ^ s[0] == s[-1]:
        print("Second")
    else:
        print("First")

def main():
    S = time.time()
    solve()
    G = time.time()
    print(G-S, "ms")

if __name__ == "__main__":
    main()