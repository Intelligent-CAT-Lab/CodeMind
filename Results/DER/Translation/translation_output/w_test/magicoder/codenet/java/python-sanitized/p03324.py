import sys

def search(a, b):
    o = (a % 1000000 == 0) * 3 + (a % 10000 == 0) * 2 + (a % 100 == 0) * 1
    return b == o

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = (D == 2) * 10000 + (D == 1) * 100 + 1
    ser = count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

if __name__ == "__main__":
    main()