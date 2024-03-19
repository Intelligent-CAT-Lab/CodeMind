import sys

def solve():
    s = input()
    l = len(s)

    if l % 2 == 0 ^ s[0] == s[-1]:
        print("Second")
    else:
        print("First")

if __name__ == "__main__":
    solve()





import sys
from io import BytesIO

def solve():
    s = sys.stdin.readline().strip()
    l = len(s)

    if l % 2 == 0 and s[0] != s[-1]:
        print("Second")
    else:
        print("First")

if __name__ == "__main__":
    solve()