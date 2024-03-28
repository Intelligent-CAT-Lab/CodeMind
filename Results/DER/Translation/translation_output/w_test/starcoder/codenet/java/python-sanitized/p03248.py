import sys

def main():
    input = sys.stdin.readline
    MOD = 1000000007
    n = int(input())
    s = input().strip()
    if s[0] == '0' or s[-1] == '1':
        print(-1)
        return
    for i in range(n//2):
        if s[i]!= s[n-i-1]:
            print(-1)
            return
    print(1, 2)
    for i in range(3, n+1):
        print(i-1, i)

if __name__ == '__main__':
    main()