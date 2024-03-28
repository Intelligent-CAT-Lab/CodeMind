def solve(num):
    num = str(num)
    a, b, c, d = map(int, num)
    ans = [0, 0, 0]

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

    return f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d}=7"

print(solve(1222))