Here is the translated Java code into Python, enclosed in triple backticks:

```python
A, B, C = map(int, input().split())
M = max(A, max(B, C))

if (A + B + C) % 2 == M % 2:
    print((3 * M - (A + B + C)) // 2)
else:
    print(((3 * M + 3) - (A + B + C)) // 2)
```

To run the test case provided in the question, you would enter "2 5 4" as the input, and the expected output should be `-74` as given.
