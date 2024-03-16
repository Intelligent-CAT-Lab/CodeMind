import sys

def main():
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())
    C = int(sys.stdin.readline().strip())
    N = B // A
    if N > C:
        print(C)
    else:
        print(N)

if __name__ == "__main__":
    main()