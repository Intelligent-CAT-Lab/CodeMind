import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    i = 0
    cnt = 0
    while cnt < c:
        i += 1
        cnt += a
        if i % 7 == 0:
            cnt += b
    print(i)

if __name__ == "__main__":
    main()