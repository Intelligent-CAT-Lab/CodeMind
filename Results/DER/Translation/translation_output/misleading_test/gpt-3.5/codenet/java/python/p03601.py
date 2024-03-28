```python
def solve():
    a, b, c, d, e, f = map(int, input().split())

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

    print(ansWater + ansSugar, ansSugar)

solve()
```
```python
# Test input processing
def test_input():
    test_input = "1 2 10 20 15 200\n"
    input_data = map(int, test_input.strip().split())
    return input_data

# Test case
def test_case():
    input_data = test_input()
    expected_output = (107, 8)
    solve()
    output = (ansWater + ansSugar, ansSugar)
    print(output)

    assert output == expected_output

test_case()
```
