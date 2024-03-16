import sys

BIG_NUM = 2000000000
MOD = 1000000007

def main():
    A, B = map(int, sys.stdin.readline().split())
    ans = A * B % MOD
    print(ans)

if __name__ == '__main__':
    main()