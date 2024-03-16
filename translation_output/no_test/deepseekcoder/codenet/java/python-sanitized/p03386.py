import sys

def main():
    a = int(input())
    b = int(input())
    k = int(input())
    set_ = set()
    cnt = 0
    for i in range(a, b+1):
        if cnt >= k:
            break
        cnt += 1
        set_.add(i)
    cnt = 0
    for i in range(b, a-1, -1):
        if cnt >= k:
            break
        cnt += 1
        set_.add(i)
    for ans in sorted(set_):
        print(ans)

if __name__ == "__main__":
    main()