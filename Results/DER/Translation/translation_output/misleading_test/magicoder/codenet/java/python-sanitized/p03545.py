def solve(num):
    num = str(num)
    a, b, c, d = map(int, num)
    if a + b + c + d == 7:
        return f"{a}+{b}+{c}+{d}=7"
    elif a + b + c - d == 7:
        return f"{a}+{b}+{c}-{d}=7"
    elif a + b - c + d == 7:
        return f"{a}+{b}-{c}+{d}=7"
    elif a - b + c + d == 7:
        return f"{a}-{b}+{c}+{d}=7"
    elif a + b - c - d == 7:
        return f"{a}+{b}-{c}-{d}=7"
    elif a - b + c - d == 7:
        return f"{a}-{b}+{c}-{d}=7"
    elif a - b - c + d == 7:
        return f"{a}-{b}-{c}+{d}=7"
    elif a - b - c - d == 7:
        return f"{a}-{b}-{c}-{d}=7"

print(solve(1222))