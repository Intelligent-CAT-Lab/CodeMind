import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    ans = 1
    for i in range(n):
        ans = (ans * k) % 1000000007
    print(ans)

if __name__ == '__main__':
    main()