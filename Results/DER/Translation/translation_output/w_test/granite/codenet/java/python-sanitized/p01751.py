import sys

def main():
    a, b, c = map(int, input().split())
    d = a + b
    for i in range(1000):
        if 0 <= (60 * i + c) % d <= a:
            print(60 * i + c)
            sys.exit()
    print(-1)

if __name__ == '__main__':
    main()