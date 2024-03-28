import sys

def main():
    a, b, c, k = map(int, sys.stdin.readline().split())
    ans = a - b
    if abs(ans) > 10**18:
        print("Unfair")
        return
    if k % 2 == 0:
        print(ans)
    else:
        print(ans * -1)

if __name__ == "__main__":
    main()