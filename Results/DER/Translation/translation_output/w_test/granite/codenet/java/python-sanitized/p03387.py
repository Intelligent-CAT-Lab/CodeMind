import sys

def main():
    x = [int(i) for i in sys.stdin.readline().split()]
    x.sort()
    temp = 2 * x[2] - x[1] - x[0]
    ans = (temp + 2) // 2 + 1 if temp % 2 == 1 else temp // 2
    print(ans)

if __name__ == "__main__":
    main()