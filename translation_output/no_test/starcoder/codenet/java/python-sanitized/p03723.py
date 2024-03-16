import sys

def main():
    input = sys.stdin.readline
    A, B, C = map(int, input().split())

    count = 0
    while A % 2 == 0 and B % 2 == 0 and C % 2 == 0:
        if A == B and B == C:
            print(-1)
            return
        A = (B + C) // 2
        B = (A + C) // 2
        C = (A + B) // 2
        count += 1
    print(count)

if __name__ == '__main__':
    main()