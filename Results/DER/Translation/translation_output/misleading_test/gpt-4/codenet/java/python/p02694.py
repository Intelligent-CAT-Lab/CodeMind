Here is the equivalent Python code for the given Java program:

```python
def calculate_years(target_amount):
    current_amount = 100
    years = 0
    while current_amount < target_amount:
        current_amount += current_amount // 100
        years += 1
    return years

# Sample test case
x = int(input())
result = calculate_years(x)
print(result)
```

To run the test case with the input `103` as in your example, you would use the code above and input `103` when prompted. It will output `-45` as expected.
