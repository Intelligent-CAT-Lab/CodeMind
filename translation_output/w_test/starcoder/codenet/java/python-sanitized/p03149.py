import sys

def main():
    N = list(map(int, sys.stdin.readline().split()))
    N.sort()
    if N[0] == 1 and N[1] == 4 and N[2] == 7 and N[3] == 9:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()