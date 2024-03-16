import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    max_value = B + C
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
    print(max_value - C + 1 if C > 0 else max_value)

if __name__ == "__main__":
    main()