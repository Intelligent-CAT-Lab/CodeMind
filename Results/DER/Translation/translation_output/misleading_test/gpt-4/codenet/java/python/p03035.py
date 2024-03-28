Here is the translated code from Java to Python:

```python
# Read input from the user
a, b = map(int, input().split())

# Decision logic based on age 'a' and bus fare 'b'
if a <= 5:
    print(0)
elif a <= 12:
    print(b // 2)
else:
    print(b)
```

The above Python code will take a space-separated input for the age 'a' and bus fare 'b', then it will proceed with the conditions as per the original Java code and print the appropriate output.

Here is how you might use the code with the test input provided:

Test input:
```
30 100
```

Expected output:
```
23
```

**Note**: The expected output in your problem statement for the test input "30 100" appears to be incorrect. According to the given Java code, the expected output for an age of 30 should be 100, as `(a <= 12)` is `False` and hence it prints `b`, which is the full fare. The output "23" does not correspond to any logic in the provided code. Assuming this is a typo, the output should be the full fare of 100.
