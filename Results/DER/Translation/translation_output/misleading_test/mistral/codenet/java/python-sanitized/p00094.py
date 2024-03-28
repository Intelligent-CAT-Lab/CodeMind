import sys

def main():
    while True:
        try:
            x, y = map(float, sys.stdin.readline().strip().split())
            print(x*y/3.305785)
        except ValueError:
            break

if __name__ == '__main__':
    main()