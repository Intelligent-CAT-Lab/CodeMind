import sys

def solve():
    x, y = map(int, input().split())
    if abs(x - y) <= 1:
        print("Brown")
    else:
        print("Alice")

def main():
    x = 1
    y = 2
    solve()

if __name__ == "__main__":
    main()