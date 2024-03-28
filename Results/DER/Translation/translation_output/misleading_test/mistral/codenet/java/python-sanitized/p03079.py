from sys import stdin

def solve():
    a, b, c = map(int, stdin.readline().split())
    if a == b == c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    solve()