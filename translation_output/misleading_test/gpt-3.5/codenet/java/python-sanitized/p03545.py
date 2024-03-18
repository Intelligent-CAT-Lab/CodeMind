def main():
    str_num = input()

    ch = [str_num[i] for i in range(4)]

    a = int(ch[0])
    b = int(ch[1])
    c = int(ch[2])
    d = int(ch[3])

    ans = [""] * 3

    if a + b + c + d == 7:
        ans = ["+", "+", "+"]
    elif a + b + c - d == 7:
        ans = ["+", "+", "-"]
    elif a + b - c + d == 7:
        ans = ["+", "-", "+"]
    elif a - b + c + d == 7:
        ans = ["-", "+", "+"]
    elif a + b - c - d == 7:
        ans = ["+", "-", "-"]
    elif a - b + c - d == 7:
        ans = ["-", "+", "-"]
    elif a - b - c + d == 7:
        ans = ["-", "-", "+"]
    elif a - b - c - d == 7:
        ans = ["-", "-", "-"]

    print(f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d}=7")


if __name__ == "__main__":
    main()