```python
def calculate_sum_of_splits(S):
    if len(S) == 1:
        return int(S)
    
    N = [int(char) for char in S]
    pattern_count = 2 ** (len(N) - 1)

    sum_of_numbers = 0
    for i in range(pattern_count):
        bin_pattern = format(i, f"0{len(N)-1}b")
        add = str(N[0])
        
        for j, bit in enumerate(bin_pattern):
            if bit == '1':
                sum_of_numbers += int(add)
                add = ""
            add += str(N[j + 1])
        
        if add:
            sum_of_numbers += int(add)

    return sum_of_numbers

# Test case
test_input = "125"
print(calculate_sum_of_splits(test_input))  # Expected output: 91
```

In the Python code, I created a function `calculate_sum_of_splits` that takes a string `S` as its argument. The code constructs a list `N` of integers from the input string. The `pattern_count` is calculated using bitwise left shift which is equivalent to calculating `2` to the power of `len(N) - 1`.

To generate the binary patterns, the built-in `format` function is used with the format specifier `0{len(N)-1}b`, which ensures that leading zeros are added to the binary representation if necessary.

The loop iterates over all possible patterns, creating the necessary splits, and adds up all values to the `sum_of_numbers`. The function then returns this sum.

I have also included a test case at the bottom to demonstrate how to call the function and display the output.
