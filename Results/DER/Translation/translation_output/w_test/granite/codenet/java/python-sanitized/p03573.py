import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())

    if A == B:
        print(C)
    elif B == C:
        print(A)
    else:
        print(B)

if __name__ == "__main__":
    main()