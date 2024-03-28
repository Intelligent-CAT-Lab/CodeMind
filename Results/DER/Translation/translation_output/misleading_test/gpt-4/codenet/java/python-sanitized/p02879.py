def solve():
    A, B = map(int, input().split())
    if A > 9 or B > 9:
        print(-1)
    else:
        print(A * B)

# You can call the solve function to test the code
if __name__ == "__main__":
    solve()