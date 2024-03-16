import sys

def main():
    D = int(sys.stdin.readline().strip())
    A = 10000
    if D == 2:
        A = 10000
    elif D == 1:
        A = 100
    else:
        A = 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    if b == o:
        return True
    else:
        return False

if __name__ == '__main__':
    main()