import sys

def search(a, b):
    o = (a % 1000000 == 0) ? 3 : (a % (10000) == 0) ? 2 : (a % 100 == 0) ? 1 : 0
    if b == o:
        return True
    else:
        return False

def main():
    sc = sys.stdin
    D = int(sc.readline())
    A = 10000 if D == 2 else (100 if D == 1 else 1)
    N = int(sc.readline())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    
    print(count * A)
    sc.close()

if __name__ == "__main__":
    main()