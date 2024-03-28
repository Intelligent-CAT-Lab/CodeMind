Here is the Java code translated into Python:

```python
A, B, C, D, E, F = map(int, input().split())

ans1 = A * 100
ans2 = 0

for a in range(F // (A * 100) + 1):
    for b in range(F // (B * 100) + 1):
        for c in range(F // C + 1):
            for d in range(F // D + 1):
                total_water = 100 * a * A + 100 * b * B
                total_sugar = C * c + D * d
                if total_water + total_sugar <= F and (A * a + B * b) > 0:
                    if total_sugar <= E * (total_water // 100) and total_sugar * ans1 > ans2 * (total_water + total_sugar):
                        ans1 = total_water + total_sugar
                        ans2 = total_sugar

print(ans1, ans2)
```

Now, let's test the code with the input provided:

Test input:
`1 2 10 20 15 200`

Expected output:
`110 10`

To test this code, you would run the following in a Python environment:

```python
# Paste the code here
```

Then enter the test input: `1 2 10 20 15 200`
You should see the expected output `110 10` printed on the console.
