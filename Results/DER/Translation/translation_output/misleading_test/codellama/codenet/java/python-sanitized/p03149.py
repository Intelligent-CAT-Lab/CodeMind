import sys

def main():
    N = list(map(int, sys.stdin.readline().split()))
    N.sort()
    if N == [1, 4, 7, 9]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()