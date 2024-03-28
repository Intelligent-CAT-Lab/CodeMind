Below is the Java code translated to Python. The Python code uses the bitwise operators to achieve the same functionality as the Java version. The to32 function ensures the binary representation is 32-bits long, by padding with leading zeros or cutting excess digits on the left.

```python
def to32(s):
    # Pad or slice the binary string to ensure it is 32 bits
    if len(s) < 32:
        s = '0' * (32 - len(s)) + s
    elif len(s) > 32:
        s = s[-32:]
    return s


def main():
    x = int(input())
    
    # Convert to binary string and perform the shifts
    twobit = bin(x)[2:]
    left = bin(x << 1)[2:]
    right = bin(x >> 1)[2:]
    
    # Adjust strings to be 32-bits long
    twobit = to32(twobit)
    left = to32(left)
    right = to32(right)
    
    # Output the various binary strings as requested
    print(twobit)
    print(''.join('1' if bit == '0' else '0' for bit in twobit))
    print(left)
    print(right)

# Execute the main function
if __name__ == "__main__":
    main()
```

To run a test with the input "8" you would do the following:

```
>>> main()
8
00000000000000000000000000001000
11111111111111111111111111110111
00000000000000000000000000010000
00000000000000000000000000000100
```

Though the test case is provided in the question, the expected output for binary inversion seems not to match the expected behaviour of the code. The expected binary-inverted output for "8", which in binary is "1000", should be "11111111111111111111111111110111" instead of "962" as mentioned. As my knowledge is current only up until early 2023, I cannot account for potential changes to Python's functionality after that time which may impact the output.
