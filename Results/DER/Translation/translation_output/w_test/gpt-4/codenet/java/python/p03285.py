Here is the equivalent Python code for the given Java program. It reads an integer number from the user, checks if it's possible to represent it as a sum of multiples of 4 and 7, and prints "Yes" if possible, otherwise "No".

```python
def check_sum_of_sevens_and_fours(N):
    limit7 = N // 7
    for i in range(limit7 + 1):
        left = N - (i * 7)
        if left % 4 == 0:
            return "Yes"
    return "No"

# Test input
N = int(input())
print(check_sum_of_sevens_and_fours(N))
```

For the provided test input `11`, the expected output using the above code will be "Yes".
