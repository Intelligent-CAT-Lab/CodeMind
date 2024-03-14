import sys

def main():
    str = input()
    ch = [str[i] for i in range(4)]

    a, b, c, d = map(int, ch)

    if a + b + c + d == 7:
        ans = "+" * 3
    elif a + b + c - d == 7:
        ans = "+" + "+" + "-"
    elif a + b - c + d == 7:
        ans = "+" + "-" + "+"
    elif a - b + c + d == 7:
        ans = "-" + "+" + "+"
    elif a + b - c - d == 7:
        ans = "+" + "-" + "-"
    elif a - b + c - d == 7:
        ans = "-" + "+" + "-"
    elif a - b - c + d == 7:
        ans = "-" + "-" + "+"
    elif a - b - c - d == 7:
        ans = "-" * 3
    else:
        print("No solution found")
        sys.exit(0)

    print(f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d}=7")

if __name__ == "__main__":
    main()