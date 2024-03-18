Here is the equivalent Python code:

```python
# Read the input by splitting the input string and converting to integers
n, m = map(int, input().split())

# Calculate combinations for n and m
n_comb = n * (n - 1) // 2
m_comb = m * (m - 1) // 2

# Calculate and print the result
print(n_comb + m_comb)
```

Now let's see how it would work with the provided test case:

Test input:
```
2 1
```

Expected output:
```
-9
```

Keep in mind that the original Java code does not produce `-9` for this input; the actual output is `1`. If `-9` is truly the expected output, the Java code provided is not consistent with the test case. The translation made above is consistent with the Java code's logic and would similarly output `1` for the input `2 1`. If `-9` is the correct output, please re-check the provided Java code and test case for accuracy.
