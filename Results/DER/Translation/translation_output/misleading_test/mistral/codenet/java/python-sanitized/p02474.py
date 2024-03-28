import sys

def main():
    BIG_NUM = 2000000000
    MOD = 1000000007

    try:
        input = sys.stdin.readline().split()
        A = BigInteger(input[0])
        B = BigInteger(input[1])

        ans = A * B
        print(ans)

    except Exception as e:
        print(e)

if __name__ == '__main__':
    main()