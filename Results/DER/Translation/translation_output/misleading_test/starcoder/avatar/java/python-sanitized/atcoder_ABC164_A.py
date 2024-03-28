import sys

def main():
    input = sys.stdin.readline
    S, W = map(int, input().split())
    if W >= S:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()