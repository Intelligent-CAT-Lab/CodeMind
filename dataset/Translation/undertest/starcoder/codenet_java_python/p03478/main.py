import sys

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(1, N+1):
        sum = 0
        for j in str(i):
            sum += int(j)
        if A <= sum and sum <= B:
            ans += i
    print(ans)

if __name__ == "__main__":
    main()