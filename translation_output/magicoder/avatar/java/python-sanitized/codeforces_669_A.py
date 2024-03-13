import sys

def read_int():
    return int(sys.stdin.readline())

def read_ints():
    return list(map(int, sys.stdin.readline().split()))

def main():
    n = read_int()
    total = 0
    if n == 2:
        print(1)
        return
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)

if __name__ == "__main__":
    main()