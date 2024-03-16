Here's the translated Python code with the same logic as the provided Java code:

```python
# Reading input from user
A, B = map(int, input().split())

# Calculating the answer
ans = (A + B) - 24 if (A + B) > 23 else A + B

# Printing the result
print(ans)
```

To test the code with the given input `9 12`, you can run it and type `9 12` into the terminal, and the expected output should be `21`.
