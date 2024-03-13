import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    k = int(sys.stdin.readline())
    set = set()
    cnt = 0
    for i in range(a, b + 1):
        if cnt >= k:
            break
        cnt += 1
        set.add(i)
    cnt = 0
    for i in range(b, a - 1, -1):
        if cnt >= k:
            break
        cnt += 1
        set.add(i)
    for ans in sorted(list(set)):
        print(ans)

if __name__ == "__main__":
    main()