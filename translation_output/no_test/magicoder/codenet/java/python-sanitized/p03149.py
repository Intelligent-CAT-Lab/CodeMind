import sys

def main():
    N = [int(i) for i in sys.stdin.readline().split()]
    N.sort()
    ans = N == [1, 4, 7, 9]
    print("YES" if ans else "NO")

if __name__ == "__main__":
    main()