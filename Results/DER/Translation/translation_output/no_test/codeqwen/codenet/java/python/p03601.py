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


if __name__ == "__main__":
    a, b, c, d, e, f = map(int, input().split())
    print(*solve(a, b, c, d, e, f))
```

This Python code does the same thing as the Java code. It takes 6 integers as input and calculates the maximum amount of water and sugar that can be made with the given constraints. The function `solve` does the heavy lifting of the calculation, and the main part of the program just calls this function with the input and prints the result.
