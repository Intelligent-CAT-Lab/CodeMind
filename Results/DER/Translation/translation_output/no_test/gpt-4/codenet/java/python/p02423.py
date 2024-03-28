Here is the Python translation of the given Java code:

```python
def to32(s):
    # Pad string with leading zeros to make it 32 characters
    a = 32 - len(s)
    if a > 0:
        s = '0' * a + s
    # In case the binary representation is longer than 32, truncate it
    elif a < 0:
        s = s[len(s) - 32:]
    return s

def main():
    x = int(input())
    
    # Convert to binary and perform left and right shifts
    twobit = bin(x)[2:]    # remove the '0b' prefix
    left = bin(x << 1)[2:] # left shift
    right = bin(x >> 1)[2:] # right shift
    
    # Convert to 32-bit representation
    twobit = to32(twobit)
    left = to32(left)
    right = to32(right)
    
    # Print original, inverted bits, left and right shifted values
    print(twobit)
    print(''.join('1' if bit == '0' else '0' for bit in twobit))  # Invert the bits
    print(left)
    print(right)

if __name__ == "__main__":
    main()
```

This Python code reads a long integer from the standard input, calculates its binary string representation and the left and right bit-shifts, formats them to be 32 characters long by adding leading zeros or truncating the string as necessary, and then prints the original and modified binary strings as requested in the Java program. The `bit` inversion is done via a "list comprehension" and `''.join()` to keep it concise and Pythonic.
