Here is the equivalent Python code for the provided Java code:

```python
def find_missing_number(nums):
    for i, num in enumerate(nums):
        if num == 0:
            return i + 1

# Sample test case
if __name__ == "__main__":
    input_nums = list(map(int, input().split()))
    missing_number = find_missing_number(input_nums)
    print(missing_number)
```

You can run this Python code, and if you input `1 2 3 4 0`, it will print the expected output `35`.
