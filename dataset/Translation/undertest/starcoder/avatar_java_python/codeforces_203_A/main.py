import sys

def main():
    input = sys.stdin.readline
    N, A, B, T, TA, TB = map(int, input().split())
    for i in range(T):
        for j in range(T):
            if N == A - i * TA + B - j * TB or N == 0 or N == A - TA * i or N == B - TB * j:
                print("YES")
                return
    print("NO")

if __name__ == '__main__':
    main()