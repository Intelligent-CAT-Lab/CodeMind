import sys

def main():
    D, A = map(int, sys.stdin.readline().split())
    N = int(sys.stdin.readline())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = (a % 1000000 == 0) * 3 + (a % 10000 == 0) * 2 + (a % 100 == 0)
    return o == b

if __name__ == "__main__":
    main()