Here's the translated Python code for the provided Java example:

```python
# Read the input from the user
a, b, x = map(int, input().split())

# Check if the conditions are met and print the corresponding output
if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")
```

This Python code will read three integers from the input, separated by spaces. It will then check if the sum of the first two integers is greater than or equal to the third integer and if the first integer is less than or equal to the third. If both conditions are true, it prints "YES", otherwise, it prints "NO".
