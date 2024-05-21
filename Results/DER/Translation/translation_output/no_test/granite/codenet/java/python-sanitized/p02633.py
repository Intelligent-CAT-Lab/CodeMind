import sys

MOD = 100000007
MAX = 2147483646
INF = 1000000000

def main():
    n = int(input())
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            sys.exit()
        i += 1

if __name__ == '__main__':
    main()