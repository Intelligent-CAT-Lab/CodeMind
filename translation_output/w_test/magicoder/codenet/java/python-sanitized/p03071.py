import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    c = 0
    for i in range(2):
        if A >= B:
            c += A
            A -= 1
        else:
            c += B
            B -= 1
    print(c)

if __name__ == "__main__":
    main()