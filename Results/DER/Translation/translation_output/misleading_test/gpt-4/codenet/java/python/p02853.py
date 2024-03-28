Here's the translated code from Java to Python:

```python
X, Y = map(int, input().split())
ans = 0
if X == 1 and Y == 1:
    ans = 1000000
else:
    if X == 1:
        ans += 300000
    if Y == 1:
        ans += 300000
    if X == 2:
        ans += 200000
    if Y == 2:
        ans += 200000
    if X == 3:
        ans += 100000
    if Y == 3:
        ans += 100000

print(ans)
```

Here's how you might run a test case:

```python
def test_function(input_data, expected_output):
    input_x, input_y = map(int, input_data.split())
    ans = 0
    if input_x == 1 and input_y == 1:
        ans = 1000000
    else:
        if input_x == 1:
            ans += 300000
        if input_y == 1:
            ans += 300000
        if input_x == 2:
            ans += 200000
        if input_y == 2:
            ans += 200000
        if input_x == 3:
            ans += 100000
        if input_y == 3:
            ans += 100000

    output = ans
    assert output == expected_output, f'Expected output: {expected_output}, Actual output: {output}'
    print(f"Test case passed: Input({input_data}) Output({output}) Expected({expected_output})")

# Sample Test case
test_function("1 1", 1000080)
```

Remember to run this sample test case in a proper Python environment.
