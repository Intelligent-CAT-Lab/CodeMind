import sys

def solve(s):
    ar = [0] * 26
    for ch in s:
        ar[ord(ch) - ord('a')] += 1
    cntod = 0
    for i in range(26):
        if ar[i] % 2 != 0:
            cntod += 1
    if cntod == 0:
        return "First"
    else:
        if cntod % 2 == 0:
            return "Second"
        else:
            return "First"

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))