import sys

def solve():
    s = input()
    l = len(s)

    if l % 2 == 0 != (s[0] == s[-1]):
        print("Second")
    else:
        print("First")

if __name__ == "__main__":
    solve()