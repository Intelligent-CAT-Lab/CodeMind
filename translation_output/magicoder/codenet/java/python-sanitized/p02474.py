import sys

BIG_NUM = 2000000000
MOD = 1000000007

def main():
    try:
        A, B = map(int, sys.stdin.readline().split())

        ans = A * B
        print(ans)

    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()