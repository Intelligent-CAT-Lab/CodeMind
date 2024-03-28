import sys

def main():
    str = sys.stdin.readline().strip()
    ch = [str[i] for i in range(4)]
    a, b, c, d = map(int, ch)
    ans = ["+", "+", "+"]

    if a + b + c + d == 7:
        pass
    elif a + b + c - d == 7:
        ans[2] = "-"
    elif a + b - c + d == 7:
        ans[1] = "-"
    elif a - b + c + d == 7:
        ans[0] = "-"
    elif a + b - c - d == 7:
        ans[1] = "-"
        ans[2] = "-"
    elif a - b + c - d == 7:
        ans[0] = "-"
        ans[2] = "-"
    elif a - b - c + d == 7:
        ans[0] = "-"
        ans[1] = "-"
    elif a - b - c - d == 7:
        ans[0] = "-"
        ans[1] = "-"
        ans[2] = "-"

    print(f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d} = 7")

if __name__ == "__main__":
    main()