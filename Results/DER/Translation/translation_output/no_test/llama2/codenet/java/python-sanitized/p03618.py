import sys

def main():
    N = int(sys.stdin.readline())
    A = sys.stdin.readline().strip()
    cnt = [0]*26
    for i in A:
        cnt[ord(i)-ord('a')] += 1
    ans = N*(N+1)/2 + 1
    for i in range(26):
        ans -= (cnt[i]*(cnt[i]+1))/2
    print(ans)

if __name__ == '__main__':
    main()