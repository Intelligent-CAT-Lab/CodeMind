import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    i = 0
    while X <= Y:
        X *= 2
        i += 1
    print(i)

if __name__ == "__main__":
    main()