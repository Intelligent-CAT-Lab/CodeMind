import sys
import time

def solve():
    s = input()
    l = len(s)

    if (l % 2 == 0) ^ (s[0] == s[l - 1]):
        print("Second")
    else:
        print("First")

def main():
    S = time.time()
    solve()
    sys.stdout.flush()
    G = time.time()
    if INPUT:
        print(f"{int((G-S)*1000)}ms")

# For this snippet to work, INPUT should be defined as a string.
# In an actual script, it would be more common to read from sys.stdin directly.
if INPUT:
    sys.stdin = io.StringIO(INPUT)

if __name__ == "__main__":
    main()