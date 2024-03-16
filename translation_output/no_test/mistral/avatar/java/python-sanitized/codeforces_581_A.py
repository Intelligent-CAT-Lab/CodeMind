import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    count = 0
    while a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    ans = (a + b) // 2
    print(count, ans)

if __name__ == "__main__":
    main()