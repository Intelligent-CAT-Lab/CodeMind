import math

def main():
    N, D = map(int, input().split())
    ans = math.ceil(N / (D * 2 + 1))
    print(ans)

if __name__ == '__main__':
    main()