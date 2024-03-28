import sys

def main():
    N = [int(sys.stdin.readline()) for _ in range(4)]
    N.sort()
    ans = N[0] == 1 and N[1] == 4 and N[2] == 7 and N[3] == 9
    print("YES" if ans else "NO")

if __name__ == "__main__":
    main()