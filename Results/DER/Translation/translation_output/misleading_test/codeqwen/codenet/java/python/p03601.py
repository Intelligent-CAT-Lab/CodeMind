Here is the Python equivalent of the Java code:

```python
def solve(a, b, c, d, e, f):
    ans_water = 100
    ans_sugar = 0
    for water_x in range(101):
        for water_y in range(101):
            water = 100 * a * water_x + 100 * b * water_y
            if water > f:
                break
            for sugar_x in range(101):
                for sugar_y in range(101):
                    sugar = c * sugar_x + d * sugar_y
                    if sugar > f - water:
                        break
                    if sugar * (100 + e) <= e * (water + sugar):
                        if sugar * (ans_water + ans_sugar) >= ans_sugar * (water + sugar):
                            ans_water = water
                            ans_sugar = sugar
    return ans_water + ans_sugar, ans_sugar


def main():
    a, b, c, d, e, f = map(int, input().split())
    ans_water, ans_sugar = solve(a, b, c, d, e, f)
    print(ans_water + ans_sugar, ans_sugar)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It takes input from the user, calls the `solve` function with the input, and prints the result. The `solve` function iterates over all possible combinations of `water_x` and `water_y` (from 0 to 100), and for each combination, it iterates over all possible combinations of `sugar_x` and `sugar_y` (from 0 to 100). For each combination, it calculates the total amount of water and sugar, and checks if it satisfies the given conditions. If it does, it updates the `ans_water` and `ans_sugar` variables. Finally, it returns the total amount of water and sugar, and the amount of sugar. The `main` function reads the input from the user, calls the `solve` function with the input
