import sys

def main():
    a, b, k = map(int, sys.stdin.readline().split())
    s = set()
    cnt = 0
    for i in range(a, b+1):
        if cnt >= k:
            break
        cnt += 1
        s.add(i)
    cnt = 0
    for i in range(b, a-1, -1):
        if cnt >= k:
            break
        cnt += 1
        s.add(i)
    for ans in sorted(s):
        print(ans)

if __name__ == "__main__":
    main()