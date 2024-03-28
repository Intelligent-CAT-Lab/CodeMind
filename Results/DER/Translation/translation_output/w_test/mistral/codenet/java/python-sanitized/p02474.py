import sys

def main():
    N = int(input())
    A, B = map(int, input().split())
    ans = (A * B) % 1000000007
    print(ans)

if __name__ == "__main__":
    main()