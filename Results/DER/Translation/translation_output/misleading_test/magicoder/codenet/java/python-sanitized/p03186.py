import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())

    max_val = B + C

    if C >= B:
        C -= B
        B = 0
    else:
        B -= C
        C = 0

    if C >= A:
        C -= A
    else:
        C = 0

    print(C if C > 0 else max_val)

if __name__ == "__main__":
    main()