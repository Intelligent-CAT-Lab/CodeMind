import sys
import io

def main():
    d, t, s = map(int, sys.stdin.readline().split())
    ans = d / s
    if ans <= t:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()