Here is the translated Python code for the provided Java code and the usage example with the provided test input:

```python
def print_day_of_week():
    day_index = int(input())
    print("thu:fri:sat:sun:mon:tue:wed".split(":")[day_index % 7])

# Sample test case
print_day_of_week()
```

When you run the Python code and input `1`, it should output `fr` to match the expected output for the test case given.
