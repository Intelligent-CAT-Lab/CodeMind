Here is the equivalent Python code for the provided Java code:

```python
def solve(a, b, c, d, e, f):
    waterX = 0
    ansWater = 100
    ansSugar = 0
    while 100 * a * waterX <= f:
        waterY = 0
        while 100 * a * waterX + 100 * b * waterY <= f:
            water = 100 * a * waterX + 100 * b * waterY
            sugarX = 0
            while water + c * sugarX <= f:
                sugarY = 0
                while water + c * sugarX + d * sugarY <= f:
                    sugar = c * sugarX + d * sugarY
                    if sugar * (100 + e) <= e * (water + sugar):
                        if sugar * (ansWater + ansSugar) >= ansSugar * (water + sugar):
                            ansWater = water
                            ansSugar = sugar
                    sugarY += 1
                sugarX += 1
            waterY += 1
        waterX += 1

    return f"{ansWater + ansSugar} {ansSugar}"

# Sample test case
input_data = "1 2 10 20 15 200"
a, b, c, d, e, f = map(int, input_data.split())
print(solve(a, b, c, d, e, f))
```

If you run this Python script, with the sample test input `'1 2 10 20 15 200'`, the expected output will be `110 10`, which matches the expected output for the Java code provided.
