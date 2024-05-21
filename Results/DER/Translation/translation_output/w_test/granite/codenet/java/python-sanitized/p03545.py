def calculate_expression(num):
    num_str = str(num)
    a = int(num_str[0])
    b = int(num_str[1])
    c = int(num_str[2])
    d = int(num_str[3])

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
    else:
        return "No valid expression found"

num = 1222
print(calculate_expression(num))