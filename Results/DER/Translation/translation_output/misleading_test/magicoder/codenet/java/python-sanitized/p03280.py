import sys

def main():
    k, b = map(int, sys.stdin.readline().split())
    print((k-1)*(b-1))

if __name__ == "__main__":
    main()