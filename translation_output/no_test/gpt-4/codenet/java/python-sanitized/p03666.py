def solve():
    N = int(input())
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())

    for i in range(N):
        max_val = D * (N - 1 - i) - C * i
        min_val = C * (N - 1 - i) - D * i
        if abs(B - A) >= min_val and abs(B - A) <= max_val:
            print("YES")
            return

    print("NO")

if __name__ == "__main__":
    solve()