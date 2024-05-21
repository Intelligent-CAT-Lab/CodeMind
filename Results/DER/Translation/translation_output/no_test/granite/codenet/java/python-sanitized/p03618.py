import sys

def main():
    s = sys.stdin.readline().strip()
    n = len(s)
    cnt = [0] * 26
    for c in s:
        cnt[ord(c) - ord('a')] += 1
    ans = (n * (n + 1) // 2) + 1
    for i in range(26):
        if cnt[i] > 0:
            ans -= (cnt[i] * (cnt[i] + 1) // 2)
    print(ans)

if __name__ == "__main__":
    main()