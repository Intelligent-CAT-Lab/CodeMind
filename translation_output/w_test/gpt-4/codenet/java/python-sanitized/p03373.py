def solve(a, b, c, x, y):
    min_cost = float('inf')
    for i in range(max(x, y) + 1):
        tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
        min_cost = min(min_cost, tmp)
    return min_cost

# Sample Test Case
input_str = "1500 2000 1600 3 2"
a, b, c, x, y = map(int, input_str.split())

print(solve(a, b, c, x, y))