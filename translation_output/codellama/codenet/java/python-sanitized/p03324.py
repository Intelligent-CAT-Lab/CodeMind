import sys

def main():
    D = int(sys.stdin.readline())
    A = 10000 if D == 2 else 100 if D == 1 else 1
    N = int(sys.stdin.readline())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    return b == o

if __name__ == "__main__":
    main()