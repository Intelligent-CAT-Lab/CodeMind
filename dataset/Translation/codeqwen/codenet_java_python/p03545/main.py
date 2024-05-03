def main():
    str_input = input()
    ch = [str_input[i:i+1] for i in range(4)]

    a = int(ch[0])
    b = int(ch[1])
    c = int(ch[2])
    d = int(ch[3])

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
        ans[2] = "-"
        ans[0] = "+"
    elif a - b + c - d == 7:
        ans[1] = "-"
        ans[0] = "+"
    elif a - b - c + d == 7:
        ans[1] = "-"
        ans[2] = "+"
    elif a - b - c - d == 7:
        ans = ["-", "-", "-"]

    print(f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d}=7")


if __name__ == "__main__":
    main()