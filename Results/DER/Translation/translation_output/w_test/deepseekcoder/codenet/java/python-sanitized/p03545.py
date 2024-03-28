def solve_equation(num):
    num = str(num)
    a, b, c, d = map(int, num)
    operators = ['+', '-', '+', '+']
    for i in range(2):
        for j in range(2):
            for k in range(2):
                if a + b * (1 - 2 * j) + c * (1 - 2 * k) + d * (1 - 2 * i) == 7:
                    operators[0] = '-' if j else '+'
                    operators[1] = '-' if k else '+'
                    operators[2] = '-' if i else '+'
                    return f"{a}{operators[0]}{b}{operators[1]}{c}{operators[2]}{d}=7"

print(solve_equation(1222))