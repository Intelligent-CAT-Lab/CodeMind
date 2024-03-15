```python
def atcoder_AGC025_A():
    n = input()

    # Check for any non-zero characters starting from the second position
    for i in range(1, len(n)):
        if n[i] != '0':
            # Calculate the sum of all digits in the number
            sum_of_digits = sum(int(digit) for digit in n)
            print(sum_of_digits)
            return

    # Check if the first character is '1', in which case print 10
    if n[0] == '1':
        print(10)
        return

    # Otherwise, print the first character (digit) as an integer
    print(int(n[0]))

# Call the function
atcoder_AGC025_A()
```
