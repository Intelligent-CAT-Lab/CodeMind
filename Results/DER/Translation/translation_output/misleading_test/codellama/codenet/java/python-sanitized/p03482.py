import sys

def solve(s):
    if len(s) % 2 == 0:
        if s[len(s) // 2 - 1] != s[len(s) // 2]:
            return len(s) // 2
        else:
            s = s[:len(s) // 2] + s[len(s) // 2 + 1:]
    mid = len(s) // 2
    for i in range(1, len(s) - mid + 1):
        if i + mid == len(s) or s[mid + i] != s[mid] or s[mid - i] != s[mid]:
            return mid + i
    return mid + len(s) - mid

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))