import sys

def main():
    H, A, B = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(A, B + 1):
        if H % i == 0:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()