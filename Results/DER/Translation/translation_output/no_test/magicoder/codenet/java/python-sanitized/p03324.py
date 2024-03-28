import sys

def search(a, b):
    o = (a % 1000000 == 0) * 3 + (a % 10000 == 0) * 2 + (a % 100 == 0) * 1
    return b == o

def main():
    D = int(sys.stdin.readline())
    A = (D == 2) * 10000 + (D == 1) * 100 + 1
    N = int(sys.stdin.readline())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

if __name__ == "__main__":
    main()