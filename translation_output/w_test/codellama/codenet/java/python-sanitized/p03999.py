import sys

def main():
    s = sys.stdin.readline().strip()
    ans = 0
    for dx in range(len(s)):
        for start in range(len(s) - dx):
            cur = int(s[start:start + dx + 1])
            ans += cur * (helper(start) * helper(len(s) - 1 - dx - start))
    print(ans)

def helper(n):
    if n == 0:
        return 1
    return 1 << (n - 1)

if __name__ == "__main__":
    main()