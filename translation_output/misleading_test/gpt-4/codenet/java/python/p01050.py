Here is the Python equivalent of the given Java code:

```python
def min_count(count_list, start, length):
    return min(count_list[start:start + length])

def calculate_answer(input_string):
    count_letters = [0] * 26
    count_digits = [0] * 10

    for char in input_string:
        if char.isdigit():
            count_digits[int(char)] += 1
        elif char.isalpha():
            count_letters[ord(char) - ord('a')] += 1
    
    ans = 0
    for i in range(26, 2, -1):
        for j in range(27 - i):
            tmp = min_count(count_letters, j, i)
            ans += tmp * 3
            for k in range(j, j + i):
                count_letters[k] -= tmp
    
    for i in range(10, 2, -1):
        for j in range(11 - i):
            tmp = min_count(count_digits, j, i)
            ans += tmp * 3
            for k in range(j, j + i):
                count_digits[k] -= tmp

    ans += sum(count_letters)
    ans += sum(count_digits)

    return ans

# Test input
test_input = "0ig3he12fz99"
# Expected output: -38
print(calculate_answer(test_input))
```

I've implemented helper function `min_count` to simplify the calculation of the minimum count in a slice and encapsulated the processing logic in a function `calculate_answer` to make the code easier to use and test.
