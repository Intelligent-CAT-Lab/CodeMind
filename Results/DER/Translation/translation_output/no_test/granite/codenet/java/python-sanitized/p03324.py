import sys

def search(a, b):
    o = (a % 1000000 == 0) * 3 + (a % 10000 == 0) * 2 + (a % 100 == 0) * 1
    return o == b

def main():
    D = int(input())
    A = 10000 if D == 2 else 100 if D == 1 else 1
    N = int(input())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

if __name__ == "__main__":
    sys.exit(main())