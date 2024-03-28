def two_coins_solve(a, b, c):
    return "Yes" if a + b >= c else "No"

if __name__ == "__main__":
    inputs = input().split()
    a, b, c = map(int, inputs)
    result = two_coins_solve(a, b, c)
    print(result)