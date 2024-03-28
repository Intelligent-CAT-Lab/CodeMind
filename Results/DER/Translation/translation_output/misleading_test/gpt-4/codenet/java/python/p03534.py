Here's the Python translation of the provided Java code. It reads a string from the user and checks whether the counts of 'a', 'b', and 'c' are all within 1 of each other.

```python
def check_abc_counts(input_str):
    abc_counts = [0] * 3
    for char in input_str:
        if char in 'abc':
            abc_counts['abc'.index(char)] += 1

    abc_counts.sort()

    return 'YES' if (abc_counts[1] - abc_counts[0] < 2) and (abc_counts[2] - abc_counts[0] < 2) else 'NO'


# Sample test case
input_str = input()
print(check_abc_counts(input_str))
```

You can paste this code into a Python environment and run it. When you input "abac", the expected output should be "YES".
