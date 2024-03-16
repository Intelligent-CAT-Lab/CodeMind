import sys

class p02879:
    def solve(self):
        # This assumes the input is given in the same line separated by a space.
        # If inputs are in different lines, replace "input()" with "sys.stdin.readline()"
        A, B = map(int, input().split())
        if A > 9 or B > 9:
            print(-1)
        else:
            print(A * B)

if __name__ == "__main__":
    main = p02879()
    main.solve()